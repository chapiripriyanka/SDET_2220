package com.CrudOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateResource {

	@Test
	public void createAResourceTest() {
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Jyoti s j");
		jobj.put("projectName", "JOGUR");
		jobj.put("status", "on going");
		jobj.put("teamSize", 10);
		
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.contentType(ContentType.JSON);
		reqSpec.body(jobj);
		
		Response response = reqSpec.post("http://localhost:8084/addProject");
		ValidatableResponse validateResp = response.then();
		validateResp.statusCode(201);
		validateResp.contentType(ContentType.JSON);
		validateResp.log().all();
		
	}



}
