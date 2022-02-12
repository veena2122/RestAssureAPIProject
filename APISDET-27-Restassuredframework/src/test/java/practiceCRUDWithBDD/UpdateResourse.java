package practiceCRUDWithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateResourse {
	@Test
	public void update()
	{
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Katti");
		jObj.put("projectName", "Tyss123");
		jObj.put("status", "On Going");
		jObj.put("teamSize", 10);
		
		given()
		.body(jObj)
		.contentType(ContentType.JSON)
		.when()
		 .put("http://localhost:8084/projects/TY_PROJ_603")
		.then()
		 .assertThat().contentType(ContentType.JSON)
		 .statusCode(200)
		 .log().all();
	}

}
