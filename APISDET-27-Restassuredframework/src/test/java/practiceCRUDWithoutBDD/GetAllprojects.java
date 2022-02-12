package practiceCRUDWithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllprojects {

	@Test
	public void getAllProjects()
	{
		//step1
		int expstatus = 200;
		Response resp = RestAssured.get("http://localhost:8084/projects");
		
		//step 2:
		System.out.println(resp.prettyPeek());
		int actustatus = resp.getStatusCode();
		Assert.assertEquals(expstatus, actustatus);
	}

}
