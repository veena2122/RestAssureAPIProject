package practiceCRUDWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void delete()
	{
	
	
	JSONObject jObj = new JSONObject();
	jObj.put("createdBy", "Team1");
	jObj.put("projectName", "NewProject1");
	jObj.put("status", "Completed");
	jObj.put("teamSize", 10);
	
	RequestSpecification resp = RestAssured.given();
	

	}

	}


