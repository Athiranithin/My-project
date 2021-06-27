package agree;

public class Circle 
{
	double pi=3.14;
	public double area(int radius)
	{
   Area a=new Area();
		
		int d=a.square(radius);
		return(pi*d);
			
				
	}
	public static void main(String args[])
	{
		Circle c=new Circle();
		
         double result=c.area(6);
         System.out.println(result);
	}
}
