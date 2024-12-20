package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runScript2 extends  takesScreenShot
	{
	@Test
	public void run()
	{
		driver.findElement(By.id("email")).sendKeys("Rajshree");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		System.out.println("TakesScree");
	}
	@Test
	public void run2()
	{
		driver.findElement(By.id("email")).sendKeys("Radhika");
		driver.findElement(By.id("pass")).sendKeys("abcdefg");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
	}
	
}


