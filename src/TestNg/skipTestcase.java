package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class skipTestcase 
{
	@Test(enabled = false)
	public void test()
	{
		Reporter.log("Seleium",true);
	}
	@Test
	public void test1()
	{
		Reporter.log("Java",true);
	}

}
