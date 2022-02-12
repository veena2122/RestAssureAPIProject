package practiceCRUDWithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteResourse {
	@Test
	public void delete() {
		
		when()
		.delete("http://localhost:8084/projects/TY_PROJ_603")
	.then()
	  .assertThat().contentType(ContentType.JSON)
	  .log().all();
		
		
		
	}

}
