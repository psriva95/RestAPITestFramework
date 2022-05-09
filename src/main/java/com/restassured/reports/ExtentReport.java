package com.restassured.reports;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.restassured.constants.Constants;

public class ExtentReport {

	public static ExtentReports report = null;
	public static String extentReportsPath= "";
	
	private ExtentReport() {
		extentReportsPath= Constants.EXTENTREPORTPATH;
		report = new ExtentReports(extentReportsPath);
		report.loadConfig(new File(Constants.EXTENTCONFIGFILEPATH));

	}
	
	public static void initialize()
	{
		new ExtentReport();
	}
	
}
