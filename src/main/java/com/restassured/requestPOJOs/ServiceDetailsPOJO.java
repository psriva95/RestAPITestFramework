package com.restassured.requestPOJOs;

public class ServiceDetailsPOJO {

	private String instructor;
	private String url;
	private String services;
	private Courses courses;
	private String expertise;
	private String linkedIn;
	
	
	public ServiceDetailsPOJO(String instructor, String url, String services, Courses courses, String expertise,
			String linkedIn) {
		this.instructor = instructor;
		this.url = url;
		this.services = services;
		this.courses = courses;
		this.expertise = expertise;
		this.linkedIn = linkedIn;
	}
	
	
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	
	
	
	
	
}
