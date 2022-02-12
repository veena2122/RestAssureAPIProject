package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth2 {
	@Test
	public void auths()
	{
		 Response response = given()
				 .formParam("client_id", "NewSDET01")
				 .formParam("client_secret", "7953018c2ef1960ba54f23fd8bfbae1f")
				 .formParam("grant_type ", "client_credentials")
				 .formParam("Redirect URI", "https://example.com")
				 .when()
				 .post("http://coop.apps.symfonycasts.com/token");
		         String token = response.jsonPath().getString("access_token");
		         
		   given() 
		   .auth().oauth2(token)
		   .pathParam("USER_ID", "2804")
		   
		   		.when()
		   		.post("	http://coop.apps.symfonycasts.com/api/USER_ID/eggs-count")
		   		.then()
		   		.log().all();
		   
	}

}
