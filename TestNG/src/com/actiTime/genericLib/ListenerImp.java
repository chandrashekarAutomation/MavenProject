package com.actiTime.genericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public abstract class ListenerImp implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult it)
   {
		String testName = it.getMethod().getMethodName();
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.driver);
	    File srcFile = edriver.getScreenshotAs(OutputType.FILE);
	    //create a new file testName
	    File destFile = new File("./ScreenShot/"+testName+".png");
//	    try
//	    {
//	    	FileUtils.copyFile(srcFile, destFile);
//	    }
//	    catch(IOException e)
//	    {
//	    	
//	    }
	    
   }

}
