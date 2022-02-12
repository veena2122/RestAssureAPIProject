package com.RMGYantraTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import newGenericUtility.BaseAPIClass;
import newGenericUtility.EndPoints;
import pojoLibrary.PojoClass;

public class CreateResourceAndVerifyInDataBaseTest extends BaseAPIClass {
	
	@Test
	public void createResourceAndverifyInDB() throws Throwable
	{
		
		//step1: create test data
		PojoClass pLib = new PojoClass("saachi" , "NewPro"+jLib.getrandomNumber(), "ongoing", "1");
		
		//step2:execute post request
 Response resp = given()
				.body(pLib)
				.contentType(ContentType.JSON)
				.when()
				.post(EndPoints.createProject);
 
 //step3:vcapture the project from response
 String expData = rLib.getJSONData(resp, "projectId");
 
 
 //step 4:verify in db
 String querry = "select * from project;";
 String actData = dLib.executeQueryAndGetData(querry, 1, expData);
 
 Reporter.log(actData, true);			
	}

}
