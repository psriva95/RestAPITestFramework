package com.restassured.responsePOJOs;


public class ComplexResponsePOJO {

		private String instructor;
		private String url;
		private String services;
		private Courses courses;
		private String expertise;
		private String linkedIn;
		private int id;
		private String createdAt;
		
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
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}
				
		@Override
		public String toString() {
			return "ComplexResponsePOJO [instructor=" + instructor + ", url=" + url + ", services=" + services
					+ ", courses=" + courses + ", expertise=" + expertise + ", linkedIn=" + linkedIn + ", id=" + id
					+ ", createdAt=" + createdAt + "]";
		}
		
}
