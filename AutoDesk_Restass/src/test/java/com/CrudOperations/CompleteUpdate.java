package com.CrudOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CompleteUpdate {

	@Test
	public void completeUpdatePutTest() {
			
			JSONObject jobj=new JSONObject();
			jobj.put("projectName", "JOGUR1");
			
			RequestSpecification reqSpec = RestAssured.given();
			reqSpec.contentType(ContentType.JSON);
			reqSpec.body(jobj);
			
			Response resp=reqSpec.put("http://localhost:8084/projects/TY_PROJ_811");
			
			ValidatableResponse vldtRes = resp.then();
			vldtRes.assertThat().statusCode(200);
			vldtRes.assertThat().contentType(ContentType.JSON);
			vldtRes.log().all();
		}

}
