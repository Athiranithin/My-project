package mav;
import java.io.IOException;
public class Mav {
	
	public static void main(String args[]) throws IOException
	{
		Mav2 obj=new Mav2();
		String a=obj.readData(0,0);
		System.out.println("value of a is"+a);
		String b=obj.readData(0,1);
		System.out.println("value of b"+b);
		
		
		
	}
	
	
	

}



