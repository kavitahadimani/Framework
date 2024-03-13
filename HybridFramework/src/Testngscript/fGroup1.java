package Testngscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test(groups = {"g1"})
public class fGroup1 {
public WebDriver driver;
@Test(groups = {"sanity"})
public void test()
{
	System.out.println("hiiiiiii");
}
@Test(groups = {"smoke"})
public void test1()
{
  System.out.println("byeee");
}
}

