package com.restassured.tests;

import org.testng.annotations.BeforeSuite;

import com.restassured.reports.ExtentReport;

public class BaseTest {

	@BeforeSuite
	public void setUpSuite() {
		ExtentReport.initialize();
		
	}

}
