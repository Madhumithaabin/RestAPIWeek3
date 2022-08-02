package Week3Assignments;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssue extends Baseclass{
	@Test
	public void createIssue() {
	
		requestSpecific.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "    \"project\":\r\n"
				+ "                {\r\n"
				+ "                    \"key\": \"JUL\"\r\n"
				+ "                },\r\n"
				+ "    \"summary\": \"create issue in RA project\",\r\n"
				+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "                    \"name\": \"Bug\"\r\n"
				+ "                }\r\n"
				+ "    }\r\n"
				+ "}");
		response=requestSpecific.post();


validateresponse=response.then();
validateresponse.assertThat().statusCode(201);	

issueId=response.jsonPath().get("id");
System.out.println("GETID"+issueId);
/*
 * List<String>sysid=response.jsonPath().getList("id");
 * System.out.println(sysid);
 */

	}

}
