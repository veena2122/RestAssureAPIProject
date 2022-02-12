

package responseValidation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.response.Response.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicResponsevalidate {
	@Test
	
	public void verify() {
		
	 String expProName = "project12";
	 Response response = when()
			 .get("http://localhost:8084/projects");
	 List<String> proNames = response.jsonPath().get("projectName");
	 boolean flag = false;
	 for(String pName:proNames) {
		 try {
			 if(pName.equals(expProName)) {
				 flag = true;
			 }
		 }
		 catch (Exception e) {
			// TODO: handle exception
		}
	 }
	 response.then()
	 .assertThat()
	 .contentType(ContentType.JSON).and().statusCode(200)
	 .log().all();
	 Assert.assertEquals(flag, true);		
			
	}

}
