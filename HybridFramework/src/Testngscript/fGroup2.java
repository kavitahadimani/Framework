package Testngscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test(groups = {"g2"})
public class fGroup2 {
	public WebDriver driver;
	@Test(groups = {"sanity"})
	public void test()
	{
		System.out.println("hellow");
	}
	@Test(groups = {"smoke"})
	public void test1()
	{
	    System.out.println("hiiii");
	}
}



