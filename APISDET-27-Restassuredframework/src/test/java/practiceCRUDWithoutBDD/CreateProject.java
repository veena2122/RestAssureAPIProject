package practiceCRUDWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {

		@Test
		public void createProject()
		{
			//step-1: create test data
			JSONObject jObj = new JSONObject();
			jObj.put("createdBy", "Team1");
			jObj.put("projectName", "NewProject1");
			jObj.put("status", "Completed");
			jObj.put("teamSize", 10);
			
			//step2: provide request specification
			RequestSpecification req = RestAssured.given();
			req.contentType(ContentType.JSON);
			req.body(jObj);
			
			//step3:  perform action
			Response resp = req.post("http://localhost:8084/addProject");
			
			//step4: print in console and verify
			System.out.println(resp.asString());
			System.out.println(resp.prettyPrint());
			System.out.println(resp.prettyPeek());
			System.out.println(resp.getContentType());	
		}
		

	}


