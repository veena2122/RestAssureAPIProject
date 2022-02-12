package parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class ParametersTest {
	
	@Test
	public void params()
	{
		given()
		  .pathParam("username", "Veena123")//run same script with different end point
		  .queryParam("sort", "created")//
		  .queryParam("per_page", "100")
		  
		.when()
		    .get("https://api.github.com/users/{username}/repos")
		    .then()
		      .assertThat().statusCode(200)
		      .log().all();
	}
	
	
	

}
