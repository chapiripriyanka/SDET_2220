package com.responsevaildationtestscripts;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import static io.restassured.RestAssured.*;

public class ValidateStaticResponse {
@Test
public void responeValidate() {
	String expectedProjectName = "BLIGHT";
 Response response = when()
	.get("http://localhost:8084/projects");
 String actualProjectName = response.jsonPath().get("[0].projectName");
 System.out.println("actual value="+actualProjectName);
 System.out.println("expected value="+expectedProjectName);
 	response.then()
 	.assertThat().statusCode(200).contentType(ContentType.JSON)
 	.log().all();
 	Assert.assertEquals(expectedProjectName, actualProjectName);
}
}
