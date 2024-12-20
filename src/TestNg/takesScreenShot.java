package TestNg;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class takesScreenShot extends  multClassMainMethod
{
	@Test
	public void screenshot() throws IOException
	{
		String photo="./Photos/";
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":","-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+"multscript.jpeg");
		FileHandler.copy(src,dst);		
	}

}
