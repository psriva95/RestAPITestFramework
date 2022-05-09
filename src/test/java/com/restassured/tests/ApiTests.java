package com.restassured.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.restassured.api.objects.GetDeserialisedResponseData;
import com.restassured.api.objects.GetPayLoadUsingDifferentStrategies;
import com.restassured.functions.RestFunctions;
import com.restassured.responsePOJOs.ComplexResponsePOJO;

import io.restassured.response.Response;

public class ApiTests extends BaseTest {

	GetPayLoadUsingDifferentStrategies complexJSONObject;
	
	@Test(description = "Test Complex Payload")
	public void validateStatusCodeForComplexPayloadExample() {
			
		complexJSONObject = new GetPayLoadUsingDifferentStrategies();
		Response response = RestFunctions.sendAndGetResponse(complexJSONObject.getRequestPayload());
		Assert.assertEquals(response.getStatusCode(), 201);
		
	}
	
	@Test(description = "Test JSON Node")
	public void validateInstructorIDFromComplexPayloadExample() {
			
		complexJSONObject = new GetPayLoadUsingDifferentStrategies();
		Response response = RestFunctions.sendAndGetResponse(complexJSONObject.getRequestPayload());
		Assert.assertTrue(response.asString().contains("Pooja"));
		
	}
	
	@Test(description = "Test JSON Path")
	public void validateFieldsUsingJSONPath() {
			
		complexJSONObject = new GetPayLoadUsingDifferentStrategies();
		Response response = RestFunctions.sendAndGetResponse(complexJSONObject.getRequestPayload());
		Assert.assertEquals(response.jsonPath().get("courses.mobileAutomation[0].price").toString(), "200");
				
	}
	
	@Test(description = "Test Nodes Using POJO")
	public void validateFieldsUsingResponsePOJO() {			
		complexJSONObject = new GetPayLoadUsingDifferentStrategies();
		Response response = RestFunctions.sendAndGetResponse(complexJSONObject.getRequestPayload());
		ComplexResponsePOJO com = response.as(ComplexResponsePOJO.class);
		Assert.assertEquals(com.getInstructor(),"Pooja");
	}

	
	@Test(description = "Test Nodes using Deserialisation")
	public void validateFieldsUsingDeserialisation() {			
		complexJSONObject = new GetPayLoadUsingDifferentStrategies();
		Response response = RestFunctions.sendAndGetResponse(complexJSONObject.getRequestPayload());
		ComplexResponsePOJO complexResponsePOJO = GetDeserialisedResponseData.getResponseData(response);
		Assert.assertEquals(complexResponsePOJO.getInstructor(),"Pooja");
	}
	

	@Test(description = "Test JSON Object")
	public void validateResponseCodeWhenObjectIsCreatedUsingJSONObject() {
		complexJSONObject = new GetPayLoadUsingDifferentStrategies();
		Response response = RestFunctions.sendAndGetResponse(complexJSONObject.getJSONObject());
		Assert.assertEquals(response.getStatusCode(), 201);
	}
	
	@Test(description = "Test Payload created using Map")
	public void validateResponseCodeWhenObjectIsCreatedUsingMap() {
		complexJSONObject = new GetPayLoadUsingDifferentStrategies();
		Response response = RestFunctions.sendAndGetResponse(complexJSONObject.getPayloadUsingMap());
		Assert.assertEquals(response.getStatusCode(), 201);
	}
	
}
