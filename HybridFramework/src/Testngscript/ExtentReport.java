package Testngscript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	@Test
	public void report()
	{
		ExtentReports report=new ExtentReports("./Report/r.html");
		ExtentTest test = report.startTest("testcase1");
		test.log(LogStatus.PASS, "testcase passed");
		test.log(LogStatus.FAIL, "testcase failed");
		test.log(LogStatus.SKIP, "skipped testcase");
		report.endTest(test);
		report.flush();
	}

}
