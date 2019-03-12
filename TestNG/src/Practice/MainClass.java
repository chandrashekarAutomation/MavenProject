package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainClass 
{
	@BeforeClass
	public void configBC()
	{
		System.out.println("launch browser");
	}
	@BeforeMethod
	public void configBM()
	{
		System.out.println("login");
	}
	@Test
	public void createTest()
	{
		System.out.println("execute createTest");
	}
	@Test
	public void modifyTest()
	{
		System.out.println("execute modifyTest");
	}
	@Test
	public void deleteTest()
	{
		System.out.println("execute deleteTest");
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("logOut");
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("close browser");
	}	
}
