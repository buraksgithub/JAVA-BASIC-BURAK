package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HW {

	public static void main(String[] args) throws IOException {
		
		//. Read the third row (row index 2) and create an ArrayList of String. 
		//Then print the ArrayList.
		
		String homework = "/Users/buraksss/Desktop/NEOTECH ACADEMY/JAVA CLASSES/32-EXCEL READING-WRITING/Homework.xlsx";
		FileInputStream fiss = new FileInputStream(homework);
		
		Workbook workbook = new XSSFWorkbook(fiss);
		
		Sheet sheet = workbook.getSheet("Companies");
		
	   //YUKARIDAN ASAGIYA COL U BELIRLEDIK-------
		int cols= sheet.getRow(0).getLastCellNum();
		
		ArrayList<String> map= new ArrayList<>();
		
		
		
		//
		for (int col=0; col<cols; col++) {
			
			
			String num= sheet.getRow(2).getCell(col).toString();
			map.add(num);
			
			}
		
		System.out.println(map);
		
		}
		
		
	}


