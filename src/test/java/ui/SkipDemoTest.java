package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {

	@Test(enabled = false)
	public void SkipTest1()
	{
		System.out.println("Skip Test-1");
	}
	
	@Test
	public void SkipTest2()
	{
		System.out.println("Test-2");
		throw new SkipException("Skipping exceptions");
	}
	
	@Test
	public void SkipTest3()
	{
		System.out.println("Test-3");
	}
}
