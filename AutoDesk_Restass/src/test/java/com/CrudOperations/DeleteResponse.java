package com.CrudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteResponse {

	@Test
	public void deleteResponseTest() {
		Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_202");
		ValidatableResponse validtRes = response.then();
		validtRes.log().all();
		validtRes.statusCode(204);
		validtRes.contentType(ContentType.JSON);
	}
}
