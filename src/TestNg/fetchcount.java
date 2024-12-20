package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fetchcount 

{
	public WebDriver driver;
	@Test
	public void test()
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	}
	
	@Test
	public void test1()
	{
		driver.get("https://www.amazon.in");
	}
}

