package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToHashSetHW {

	public static void main(String[] args) throws IOException {
		// Read the fifth column (col index 4) and create an HashSet of Double. Then print the HashSet.

		

		String homework = "/Users/buraksss/Desktop/NEOTECH ACADEMY/JAVA CLASSES/32-EXCEL READING-WRITING/Homework.xlsx";
		FileInputStream fiss = new FileInputStream(homework);
		
		Workbook workbook = new XSSFWorkbook(fiss);
		
		Sheet sheet = workbook.getSheet("Companies");
		

		int rows= sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		System.out.println(rows);
		
		Set<String> map= new HashSet<>();
		
		
	for (int row=1; row<rows; row++) {
			
			
			String num= sheet.getRow(row).getCell(4).toString();
			map.add(num); }
	
	    System.out.println(map);    }
	
	
}
		
		
		
	
