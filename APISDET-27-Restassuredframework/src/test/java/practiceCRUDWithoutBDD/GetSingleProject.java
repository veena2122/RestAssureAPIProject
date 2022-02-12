package practiceCRUDWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {
	
	@Test
	public void GetSingleproduct()
	{
		//step 1:
		Response resp = RestAssured.get("http://localhost:8084/projects/");
		
		//step2:
		System.out.println(resp.prettyPeek());
	}
	
}


