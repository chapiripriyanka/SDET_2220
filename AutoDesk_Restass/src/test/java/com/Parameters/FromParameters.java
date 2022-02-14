package com.Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class FromParameters {
@Test
public void formsTest() {
	given()
	.contentType(ContentType.JSON)
	.formParam("CreatedBy", "Priyanka")
	.formParam("ProjectName", "Blightss")
	.formParam("Status", "completed")
	.formParam("teamSize", 12)
	.when()
	.post("http://localhost:8084/addProject")
	.then().log().all();
}
}
