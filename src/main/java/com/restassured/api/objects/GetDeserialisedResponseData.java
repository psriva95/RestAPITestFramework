package com.restassured.api.objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restassured.responsePOJOs.ComplexResponsePOJO;

import io.restassured.response.Response;

public class GetDeserialisedResponseData {

	
			public static ComplexResponsePOJO getResponseData(Response res) {
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
				try {
					return objectMapper.readValue(res.asString(), ComplexResponsePOJO.class);
				} catch (JsonMappingException e) {
					e.printStackTrace();
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
				return null;
			
			}	
}
