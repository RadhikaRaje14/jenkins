package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecuteSameTestcase
{
	@Test(invocationCount = 3,priority = 1)
	public void sameTest()
	{
		Reporter.log("hello",true);
	}
	@Test
	public void Test2()
	{
		Reporter.log("World",true);
	}

}
