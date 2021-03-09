package com.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static String  name="";

	public static String excel(int i, int j) throws IOException {

		File f = new File(
				"C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\excel\\Book2.xlsx");
		FileInputStream fo = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fo);
		Sheet s = bk.getSheet("data");
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		int typ = c.getCellType();
		if (typ == 1) {
			name = c.getStringCellValue();
		} else if (typ == 0) {
			DateUtil.isCellDateFormatted(c);
			Date dt = c.getDateCellValue();
			SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");
			name = date.format(dt);
		} else {
			double d = c.getNumericCellValue();
			long lo = (long) d;
			name = String.valueOf(lo);
		}
		return name;
		

}}
