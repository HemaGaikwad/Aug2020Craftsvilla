package com.craftsvilla.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public static String[][] getData(String filename, String sheetname)
	{
		File f=null;
		FileInputStream fin= null;
		Workbook wb = null;
		Sheet sh = null;
		try
		{
			f = new File(filename);
			fin = new FileInputStream(f);
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet(sheetname);
			
			int rowNum = sh.getPhysicalNumberOfRows();   //sh.getLastRowNum()+1;
			int colNum = sh.getRow(0).getLastCellNum();
			
			String [][] data = new String[rowNum][colNum];
			for(int i =0; i<rowNum; i++)
			{
				Row r = sh.getRow(i);
				for(int j =0; j<colNum; j++)
				{
					Cell c = r.getCell(j);
					String value =new  DataFormatter().formatCellValue(c);
					data[i][j]=value;
				}
			}
			return data;
		}
		catch(Exception e)
		{
			return null;
		}
	}

}
