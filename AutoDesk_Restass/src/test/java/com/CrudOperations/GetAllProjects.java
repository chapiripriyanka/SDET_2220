package com.CrudOperations;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjects {
@Test
public void getAllProjects() {

	Response resp = RestAssured.get("http://localhost:8084/projects");
	ValidatableResponse vaildateResponse = resp.then();
	
}
	
}

