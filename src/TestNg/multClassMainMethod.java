package TestNg;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class multClassMainMethod
{	
	public WebDriver driver;
	@BeforeMethod
	public void Generic()
		{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		 driver=new FirefoxDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		}
	
	@AfterMethod
	public void closeappl()
	{
		driver.close();
	}
}