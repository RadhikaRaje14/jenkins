package selenium;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	public class demo1 {
		@Test(dependsOnMethods = "test2")
		public void test1()
		{
			Reporter.log("Selenium",true);
		}
		@Test(dependsOnMethods = "hello3")
		public void test2()
		{
			Reporter.log("java",true);
		}
	
		@Test()
		public void hello3()
		{
			Reporter.log("sql",true);
		}
		
		}
	
	}
