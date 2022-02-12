package newGenericUtility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseAPIClass {
	
	public DatabaseUtils dLib = new DatabaseUtils();
	public javaUtility jLib = new javaUtility();
	public RestassuredUtility rLib = new RestassuredUtility();
	
	@BeforeSuite
	public void bsConfig() throws Throwable
	
	{
		baseURI = "http://localhost";
		port = 8084;
		
		dLib.connectToDB();
		System.out.println("=====database connection established");
	}
	@AfterSuite
	public void asConfig() throws Throwable
	{
		dLib.closeDB();
		System.out.println("======database connection closed");
	}

}
