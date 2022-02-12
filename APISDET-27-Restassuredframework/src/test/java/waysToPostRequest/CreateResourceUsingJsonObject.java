package waysToPostRequest;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateResourceUsingJsonObject {
	
	@Test
	public void create()
	{
		
		Random ran = new Random();
		int random = ran.nextInt(500);
		
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "VeenaRK");
		jObj.put("projectName", "sdetNew01"+random);
		jObj.put("status", "Completed");
		jObj.put("teamSize", 25);
		
		given()
		  .body(jObj)
		  .contentType(ContentType.JSON)
		.when()
		   .post("http://localhost:8084/addProject")
		.then()
		   .assertThat().statusCode(201)
		   .contentType(ContentType.JSON)
		   .log().all();
		
		
	}

}
