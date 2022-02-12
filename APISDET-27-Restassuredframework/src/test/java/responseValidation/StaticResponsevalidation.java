package responseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import static io.restassured.RestAssured.*;

public class StaticResponsevalidation {
	
	@Test
	public void validate()
	{
		
		String expProName = "project10";
		 Response response = when()
				      .get("http://localhost:8084/projects");
		 String actualProName = response.jsonPath().get("[1].projectName");
		 
		 response.then()
		 .assertThat().contentType(ContentType.JSON).and().statusCode(200)
		 .log().all();
		 
		 Assert.assertEquals(expProName, actualProName);
			
	}

}
