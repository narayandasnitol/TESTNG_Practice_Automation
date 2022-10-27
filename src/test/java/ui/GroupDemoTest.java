package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;


@Test(groups= "user-registration")
public class GroupDemoTest {
	
	
	@Test(priority = 1, groups = "regression")
	public void aTest1()
	{
		System.out.println("Test-1");
	}
	
	@Test(priority = 2, groups = "regression")
	public void aTest2()
	{
		System.out.println("Test-2");
	}
	
	@Test(priority = 3, groups = {"regression","bvt"})
	public void aTest3()
	{
		System.out.println("Test-3");
	}
	
	@Test(priority = 4, groups = "bvt")
	public void aTest4()
	{
		System.out.println("Test-4");
	}
}