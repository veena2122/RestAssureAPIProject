package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QuerryParameterTest {
	@Test
	public void param() {
		given()
		.queryParam("page", "10")
		.when()
		.get("http://reqres.in/api/users")
		.then()
		.assertThat().statusCode(200)
		.log().all();
	}

}
