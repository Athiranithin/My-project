package exel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
	public static FileInputStream f;

	public static XSSFSheet sh;
	
	public static XSSFWorkbook w;
	
	public static String readStringData(int i,int j)throws IOException
	{
		f=new FileInputStream("F:\\Users\\HP\\eclipse-workspace\\345\\src\\main\\resources\\example.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		return c.getStringCellValue();
		

	}
	public static String readIntrgerData(int i,int j)throws IOException
	{
		 f=new FileInputStream("F:\\Users\\HP\\eclipse-workspace\\345\\src\\main\\resources\\example.xlsx");
		 w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int a=(int) c.getNumericCellValue();
		return String.valueOf(a);

	}

}
