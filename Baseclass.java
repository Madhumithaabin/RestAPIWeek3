package Week3Assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Baseclass {

	public static RequestSpecification requestSpecific;
	public static String issueId;
	public static Response response;
	public static ValidatableResponse validateresponse;
	
	@BeforeSuite
	public void preCondition() {
		RestAssured.baseURI="https://api-training.atlassian.net/rest/api/2/issue/";


	requestSpecific=RestAssured.given().log().all().auth()
		.preemptive()
		.basic("hari.radhakrishnan@testleaf.com", "oVr1P1PEK3TT4r8YYyHD200B");
		
						}
	
						/*
						 * @AfterMethod public void postCondition() { validateresponse.log().all(); }
						 */}
