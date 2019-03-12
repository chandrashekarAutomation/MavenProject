package com.actiTime.genericLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass extends FileLib
{
	public static WebDriver driver;
	public FileLib file = new FileLib();
	@BeforeClass
	public void configBC() throws Throwable
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void configBM() throws Throwable
	{
		String URL = file.getCommonDataKeyvalue("url");
		String USERNAME = file.getCommonDataKeyvalue("username");
		String PASSWORD = file.getCommonDataKeyvalue("password");
		driver.get(URL);
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod
	public void configAM()
	{
		while(true)
		{
			try
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			}
			catch(Exception e)
			{
				System.out.println("continues");
			}
		}
	}
	@AfterClass
	public void configAC()
	{
		driver.close();
	}
}
