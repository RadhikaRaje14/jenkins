package AssertionTester;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertVerification {
	public WebDriver driver;
	@Test
	public void test()
	{	
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	
	String title=driver.getTitle();
	Assert.assertEquals(title,"Facebook login or sign up");
	System.out.println("India");
	}

}
