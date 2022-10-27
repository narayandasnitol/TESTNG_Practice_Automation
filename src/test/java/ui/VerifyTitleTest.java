package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	@Test
	public void titleTest()
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.get("https://www.ebay.com/");
		 
		 
		 String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		 String actualTitle = driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle);
		 
		 
		 driver.close();
	}
}
