package practiceCRUDWithBDD;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateResource {
	@Test
	public void create() {
		Random ran = new Random();
		int randomNum = ran.nextInt(500);
				
				
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Veena");
		jObj.put("projectName", "TyssNew1"+randomNum);
		jObj.put("status", "Completed");
		jObj.put("teamSize", 100);
		
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
