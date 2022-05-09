package com.restassured.api.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.restassured.requestPOJOs.Courses;
import com.restassured.requestPOJOs.Courses.ApiAutomation;
import com.restassured.requestPOJOs.Courses.MobileAutomation;
import com.restassured.requestPOJOs.Courses.WebAutomation;
import com.restassured.requestPOJOs.ServiceDetailsPOJO;

public class GetPayLoadUsingDifferentStrategies {

	
		public ServiceDetailsPOJO getRequestPayload() {
			
			List<WebAutomation> web = new ArrayList<WebAutomation>();
			Courses.WebAutomation selenium = new Courses.WebAutomation();
			selenium.setCourseDetails("Selenium Webdriver");
			selenium.setPrice(100);
				web.add(selenium);
							
			Courses.WebAutomation protractor = new Courses.WebAutomation();
			protractor.setCourseDetails("Protractor");
			protractor.setPrice(100);
				web.add(protractor);
					
			List<ApiAutomation> api = new ArrayList<ApiAutomation>();
			Courses.ApiAutomation rest = new Courses.ApiAutomation();
			rest.setCourseDetails("RestAssured");
			rest.setPrice(200);
				api.add(rest);
			
			Courses.ApiAutomation postman = new Courses.ApiAutomation();
			postman.setCourseDetails("Postman");
			postman.setPrice(200);
				api.add(postman);
			
			List<MobileAutomation> mob = new ArrayList<MobileAutomation>();
			Courses.MobileAutomation appium = new Courses.MobileAutomation();
			appium.setCourseDetails("Appium");
			appium.setPrice(200);
				mob.add(appium);
				
			
			Courses courses = new Courses();
			courses.setWebAutomation(web);
			courses.setApiAutomation(api);
			courses.setMobileAutomation(mob);
			
			ServiceDetailsPOJO serviceDetailsObject = new ServiceDetailsPOJO("Pooja", "https://abc.com",
					"QA Testing", courses, "SDET", "abc@linkedin.com");
			
			return serviceDetailsObject;
		}
	

		public Map<String,Object>  getPayloadUsingMap() {
			Map<String,Object> payl = new HashMap<String,Object>();
			payl.put("name", "Pooja");
			payl.put("job","Engineer");
			ArrayList<String> skills = new ArrayList<String>();
			skills.add("Java");
			skills.add("TestNG");
			payl.put("skills",skills);
			
			Map<String,Object> inner = new HashMap<String,Object>();
			inner.put("companyName","CS");
			inner.put("emailId","abc@xyz.com");
			payl.put("details",inner);
			
			return payl;
		}
	
		
		public JSONObject getJSONObject() {

			JSONObject jsonObject = new JSONObject();
			jsonObject.put("name", "Pooja");
			jsonObject.put("job", "Engineer QA");

			JSONArray jsonArray = new JSONArray();
			jsonArray.put("Java");
			jsonArray.put("TestNG");
			jsonArray.put("Selenium");

			jsonObject.put("skills", jsonArray);

			JSONObject jsonObject2 = new JSONObject();
			jsonObject2.put("companyName", "Kronos");
			jsonObject2.put("emailId", "abc@xyz.com");

			jsonObject.put("details", jsonObject2);

			return jsonObject;
		}

}

