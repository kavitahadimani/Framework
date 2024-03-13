package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genricscript.basepage;
public class pommainclass extends basepage{
	@FindBy(id="email")
	private WebElement uName;
	
	@FindBy(name="pass")
	public WebElement pwd;
	
	@FindBy(name="login")
	public WebElement clk;
	
	public pommainclass(WebDriver driver)
	{
		super(driver);
	}
	public void passData(String un)
	{
		uName.sendKeys(un);
	}
	public void passData1(String pass)
	{
		pwd.sendKeys(pass);
	}
	public void click()
	{
		clk.click();
	}
}

