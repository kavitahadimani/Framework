package Genricscript;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

import Util.fetchproperty;

public class baseclass implements Fwkconstants{
	
	public WebDriver driver;
	@BeforeMethod
	public void openappln() throws FileNotFoundException, IOException
	{
		System.setProperty(c_key, c_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(fetchproperty.fetchprop());
	}
	public void closeappln(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			GenericCapture.getphoto(driver);
		}
		driver.close();
	}

}
