package newGenericUtility;

import java.util.Random;

/**
 * This class contains java specific generic method
 * @author veena
 *
 */
public class javaUtility {
	
	public int getrandomNumber()
	{
		Random ran = new Random();
		int value = ran.nextInt(500);
		return value;
		
	}
	

}
