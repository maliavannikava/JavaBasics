package com.class32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/testdata/Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet1=book.getSheet("Sheet1");
		
		int rows=sheet1.getPhysicalNumberOfRows();
		int cols=sheet1.getRow(0).getLastCellNum();
		
		List<Map<String, String>> listMap=new ArrayList<>();
		
		for(int r=1; r<rows; r++) {
			
			Map<String, String> map=new LinkedHashMap<>();
			for(int c=0; c<cols; c++) {
				
				String key=sheet1.getRow(0).getCell(c).toString();
				String value=sheet1.getRow(r).getCell(c).toString();
			}	
			
			listMap.add(map);
		}
	}
}
