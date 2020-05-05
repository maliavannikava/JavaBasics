package com.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath="/Users/marharytamaliavannikava/eclipse-workspace/JavaBasics/TestData/Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		// get an Object of Workbook type
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		// number of rows
		int rows=sheet.getPhysicalNumberOfRows();
		
		// number of columns
		int col=sheet.getRow(0).getLastCellNum();
		
		// get data from all rows and all columns
		for(int r=0; r<rows; r++) {
			for(int c=0; c<col; c++) {
				String cellVal=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
