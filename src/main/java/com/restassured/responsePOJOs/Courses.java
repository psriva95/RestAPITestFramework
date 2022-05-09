package com.restassured.responsePOJOs;

import java.util.List;

public class Courses {

	private List<WebAutomation> webAutomation;
	private List<ApiAutomation> apiAutomation;
	private List<MobileAutomation> mobileAutomation;


	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	public List<ApiAutomation> getApiAutomation() {
		return apiAutomation;
	}
	public void setApiAutomation(List<ApiAutomation> apiAutomation) {
		this.apiAutomation = apiAutomation;
	}
	public List<MobileAutomation> getMobileAutomation() {
		return mobileAutomation;
	}
	public void setMobileAutomation(List<MobileAutomation> mobileAutomation) {
		this.mobileAutomation = mobileAutomation;
	}

	public static class WebAutomation {

		private String courseDetails;
		private int price;
		public String getCourseDetails() {
			return courseDetails;
		}
		public void setCourseDetails(String courseDetails) {
			this.courseDetails = courseDetails;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}

	}

	public static class ApiAutomation {

		private String courseDetails;
		private int price;
		public String getCourseDetails() {
			return courseDetails;
		}
		public void setCourseDetails(String courseDetails) {
			this.courseDetails = courseDetails;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}

	}


	public static class MobileAutomation {

		private String courseDetails;
		private int price;
		public String getCourseDetails() {
			return courseDetails;
		}
		public void setCourseDetails(String courseDetails) {
			this.courseDetails = courseDetails;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}

	}

}
