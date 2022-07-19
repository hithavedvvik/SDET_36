package practice;

import org.testng.annotations.Test;

public class Practice1Test {

	
	@Test
	public void practice1Test() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAM = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println("Test1");
		System.out.println("Test1"+URL);
		System.out.println("Test1"+BROWSER);
		System.out.println("Test1"+USERNAM);
		System.out.println("Test1"+PASSWORD);
		
	}
}