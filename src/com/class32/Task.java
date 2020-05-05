package com.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {

	public static void main(String[] args) throws IOException {
		
		String filePath="/Users/marharytamaliavannikava/eclipse-workspace/JavaBasics/TestData/Task1.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getLastCellNum();
		
		for(int r=0; r<rows; r++) {
			for(int c=0; c<col; c++) {
				String cellVal=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+"   ");
			}
			System.out.println();
		}
		
	}
}
