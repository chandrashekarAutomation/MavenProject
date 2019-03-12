package com.actiTime.customerTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actiTime.genericLib.BaseClass;

public class CreateCustomerTest extends BaseClass
{
	@Test
	public void CreateCustomerTest() throws Throwable
	{
		//read data from excel sheet
		String customerName = file.getExcelData("Sheet2", 1, 1);
		
		//navigate to TASKS page
		driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();
		
		//navigate to create customer page
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys(customerName);
		driver.findElement(By.name("createCustomerSubmit")).click();
	}
}
