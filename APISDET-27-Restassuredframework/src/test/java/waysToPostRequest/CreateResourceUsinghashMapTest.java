package waysToPostRequest;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateResourceUsinghashMapTest {
	
	@Test
	public void create()
	{
		
		HashMap map= new HashMap();
		
		map.put("createdBy", "VeenaRK");
		map.put("projectName", "sdetNew");
		map.put("status", "On going");
		map.put("teamSize", 10);
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().contentType(ContentType.JSON)
		.statusCode(201)
		.log().all();
	}

}
