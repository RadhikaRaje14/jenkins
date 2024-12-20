package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runnerScript extends  multClassMainMethod
	{
	@Test
	public void run()
	{
		driver.findElement(By.id("email")).sendKeys("Rajshree");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
	}

}

