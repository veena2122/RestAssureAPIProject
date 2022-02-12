package parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParameterTest {
	
	@Test
	public void param()
	{
		String proId = "TY_PROJ_010";
		given()
		.pathParams("ProjectId", proId)
		.when()
		.delete("http://localhost:8084/projects/{ProjectId}")
		.then()
		
		.log().all();
	}

}
