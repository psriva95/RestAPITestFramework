package com.restassured.reports;

import com.relevantcodes.extentreports.ExtentTest;

public class ExtentManager {
		
		private ExtentManager() {
			
		}
		
	    public static final ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();
		
		public static ExtentTest getExtTest() {
			return extentTest.get();
		}

		public static void setExtentTest(ExtentTest test) {
			extentTest.set(test);
		}

}
