package Week3Assignments;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Updateissue extends Baseclass{
@Test
public void updateIssuejira() {
	requestSpecific
	//.queryParam("id",issueId)
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body("{\r\n"
			+ "    \"fields\": {\r\n"
			+ "\r\n"
			+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
			+ "    }\r\n"
			+ "}");
	
validateresponse= requestSpecific
			.when()
			.put(issueId).then();
	
	
	validateresponse.assertThat().statusCode(200);
	
}
}
