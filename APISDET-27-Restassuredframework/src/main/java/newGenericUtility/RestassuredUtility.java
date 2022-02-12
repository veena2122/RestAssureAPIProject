package newGenericUtility;

import io.restassured.response.Response;

/**
 * this class contains generic methods specific to rest assured
 * @author veena
 *
 */
public class RestassuredUtility {
	public String getJSONData(Response resp, String jsonPath)
	{
		String jsonData = resp.jsonPath().get(jsonPath);
		return jsonData;
		
	}

}
