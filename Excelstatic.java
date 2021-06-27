package exel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


	public static FileInputStream f;

	public static XSSFsheet sh;
	
	public static XssFWorkbook w;
	
	public static String readStringData(int i,int j)throws IOException
	{
		 f=new FileInputStream("");
		 w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		Row r=sh.getRow0(i);
		cell c=r.getCell(j);
		return c.getStringCellValue();
		

	}
	public static String readIntrgerData(int i,int j)throws IOException
	{
		 f=new FileInputStream("\\C:\\Users\\HP\\Desktop\\example.xlsx\\");
		 w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int a=(int) c.getNumericCellValue();
		return String.valueof(a);

	}
	
	

