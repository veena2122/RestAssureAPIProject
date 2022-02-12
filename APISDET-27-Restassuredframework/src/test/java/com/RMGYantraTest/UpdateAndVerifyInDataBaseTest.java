package com.RMGYantraTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import newGenericUtility.BaseAPIClass;
import newGenericUtility.EndPoints;
import pojoLibrary.PojoClass;

public class UpdateAndVerifyInDataBaseTest extends BaseAPIClass {
	
	@Test
	public void updateDataAndVerifyInDB() throws Throwable
	{
		//step 1: update the data
		PojoClass pLib = new PojoClass("Veena", "new-pro1", "completed", "200");
		
		//step2: execute put request
		Response resp = given()
		.body(pLib)
		.contentType(ContentType.JSON)
		.when()
		.put(EndPoints.updateproject +"/TY_PROJ_202");
		
		//step3: capture the project reponse
		String expData = rLib.getJSONData(resp, "status");
		
		//step4: verify in databade
		String querry = "select * from project;";
		String actData = dLib.executeQueryAndGetData(querry, 5, expData);
		
		Reporter.log(actData,true);
		System.out.println(actData);
		
	}

}
