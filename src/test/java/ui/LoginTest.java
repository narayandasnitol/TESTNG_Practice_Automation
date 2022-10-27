package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("\nLogin to application");
	}
	
	@AfterTest
	public void logoutFromApplication()
	{
		System.out.println("Logout from application\n");
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB connected");
	}
	
	@AfterMethod
	public void disconnectFromDB()
	{
		System.out.println("DB disconnected");
	}
	
	@Test(priority = 1, description = "This is a login test")
	public void aTest1()
	{
		System.out.println("Test-1");
	}
	
	@Test(priority = 2, description = "This is a logout test")
	public void aTest2()
	{
		System.out.println("Test-2");
	}

}
