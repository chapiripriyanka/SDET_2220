package com.Parameters;

import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;

public class GitHubPathQuery {
@Test
public void gitPathQueryTest() {
	given()
	.param("username", "chapiripriyanka")
	.queryParam("sort", "Created")
	.when()
	.get("https://api.github.com/users/{username}/respone")
	.then()
	.log().all();
}
}
