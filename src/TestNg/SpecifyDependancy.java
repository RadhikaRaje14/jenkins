package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SpecifyDependancy {
	@Test
	public void Demo1()
	{
		Reporter.log("Selenium",true);
	}
	@Test(dependsOnMethods = "Demo1")
	public void Demo2()
	{
		Reporter.log("Sql",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = "Demo2")
	public void Demo3()
	{
		Reporter.log("Java",true);
	}
}
