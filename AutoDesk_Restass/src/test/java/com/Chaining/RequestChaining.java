package com.Chaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import  static io.restassured.RestAssured.*;

public class RequestChaining {
@Test
public void requestChainingTest() {
	
	 Response response = when()
			 .get("http://localhost:8084/projects");
	 String projectID = response.jsonPath().get("[1].projectId");
	 given()
	 .param("projectId", projectID)
	 .when()
	 .delete("https://localhost:8084/projects/{projectId}")
		.then().log().all();
	
}
}