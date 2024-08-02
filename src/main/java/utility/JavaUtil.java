package utility;

import java.util.Random;

public class JavaUtil {
	public static int generateRandomNumber()
	{
		Random r = new Random();
		return r.nextInt(1000);
	}
}

