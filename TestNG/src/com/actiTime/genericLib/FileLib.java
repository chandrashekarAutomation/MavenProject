package com.actiTime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{
	public String getCommonDataKeyvalue(String Key) throws Throwable

	{
		FileInputStream fis = new FileInputStream("./Data/commonData.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String data = pro.getProperty(Key);
		return data;
	}
	
	public String getExcelData(String name, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(name);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String data = cell.getStringCellValue();
		return data;
	}
	
	public void setExcelData(String name, int rowNum, int cellNum, String data) throws Throwable
	{

		FileInputStream fis = new FileInputStream("./Data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(name);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./Data/Book1.xlsx");
		wb.write(fos);
		wb.close();	
	}
}