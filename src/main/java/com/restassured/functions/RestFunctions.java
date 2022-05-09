package com.restassured.functions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.restassured.constants.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.Map;

import org.json.JSONObject;


public class RestFunctions {

		public static Response sendAndGetResponse(Object o) {
			
				ObjectMapper objectMapper = new ObjectMapper();
				try {
					String requestPayload = objectMapper.writeValueAsString(o);
					
					Response res = given().
							       auth().
							       none().
							       header("Content-Type","application/json").
							       contentType(ContentType.JSON).
							       when().
							       body(requestPayload).
							       post(Constants.GET_URL_FOR_COMPLEX_JSON);		
					
					return res;
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;			
		}
		

		
		
		public static Response sendAndGetReponse(JSONObject jsonObject) {
	
			Response res = given().
				       auth().
				       none().
				       header("Content-Type","application/json").
				       contentType(ContentType.JSON).
				       when().
				       body(jsonObject.toString()).
				       post(Constants.GET_URL_FOR_COMPLEX_JSON);	
			
			return res;
		}
		
		
		public static Response sendAndGetReponse(Map<String, Object>  map) {
	
			Response res = given().
				       auth().
				       none().
				       header("Content-Type","application/json").
				       contentType(ContentType.JSON).
				       when().
				       body(map).
				       post(Constants.GET_URL_FOR_COMPLEX_JSON);	
			
			return res;
		}
	
		
		
}
