package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BearerTokenTest {
	@Test
	public void bearerAuth()
	{
		given()
		.auth().oauth2("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 ")
		.when()
		.get("https://api.github.com//user/repos")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	
	}

}
