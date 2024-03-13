package Genricscript;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class GenericCapture {
	@Test
	public static void getphoto(WebDriver driver)
		{ 
		 Date d=new Date();
		 String d1 = d.toString();
		 String da = d1.replaceAll(":", "-");
		 TakesScreenshot tss=(TakesScreenshot)driver;
		 File tmp = tss.getScreenshotAs(OutputType.FILE);
		 File pmt=new File("./photos/"+da+".jpg");
		 try
		 {
			 FileHandler.copy(tmp, pmt);
		 }
		 catch(IOException e)
		 {
			 System.out.println("photo is not captured");
			 e.printStackTrace();
		 }
	}

	
	}



