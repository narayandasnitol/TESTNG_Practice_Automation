package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextTest {
	
	@Test
	public void TitleAndTextTest()
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		 
		 SoftAssert softassert = new SoftAssert();
		 
		 
		 System.out.println("Verifying title...");
		 String expectedTitle = "Electronics, Cars, Fashion, gollectibles & More | eBay";
		 String actualTitle = driver.getTitle();
		 softassert.assertEquals(actualTitle, expectedTitle, "Title verification failed!");
		 
		 
		 System.out.println("Verifying text...");
		 String expectedText = "SearchT";
		 String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		 softassert.assertEquals(actualText, expectedText, "Text verification failed!");
		
		 
		 System.out.println("Closing browser...");
		 driver.close();
		 
		 softassert.assertAll();
		 
	}
}
