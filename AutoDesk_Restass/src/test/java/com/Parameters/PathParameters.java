package com.Parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParameters {
	@Test
	public void pathTest() {
		String projectId = "TY_PROJ_001";
		given()
		.pathParam("ProjectID", projectId)
	.when()
	.get("http://localhost:8084/projects/{projectId}")
	.then().log().all();
	}

}
