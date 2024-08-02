package TestngBasic;

import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class Practice1 {
	public static void main(String[] args) {
		System.out.println("i am Main");
	}
	
	@Test 
	public void main()
	{
		System.out.println("I am testng");
	}

}
