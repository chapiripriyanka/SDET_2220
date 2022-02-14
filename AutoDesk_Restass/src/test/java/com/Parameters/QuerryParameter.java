package com.Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QuerryParameter {
@Test
public void querryParameterTest() {
	given()
	.queryParam("page", "2")
	.when()
	.get("https://reqres.in/api/users")
	.then().log().all();
}
}
