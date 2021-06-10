import java.util.*;
interface sample
{
	public void area();
	public void perimeter();

}
class circle implements sample
{
	float a;
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle:  ");
		a=sc.nextFloat();
		System.out.println("Area of circle:  "+(3.14*a*a));
	}
	public void perimeter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle:  ");
		a=sc.nextFloat();
		System.out.println("Perimeter of circle:  "+(2*3.14*a));
	}
}
class rectangle implements sample
{
	int a,b;
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle:  ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Area of rectangle:  "+(a*b));
	}
	public void perimeter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle:  ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Area of rectangle:  "+(2*(a+b)));
	}
}
class hierarchy
{
	public static void main(String args[])
	{
		int a;
		circle c=new circle();
		rectangle r=new rectangle();
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("\n\n1.AREA OF CIRCLE\n2.PERIMETER OF CIRCLE\n3.AREA OF RECTANGLE\n4.PERIMETER OF RECTANGLE\n5.EXIT ");
		System.out.println("Enter your choice:  ");
		a=sc.nextInt();
		switch(a)
		{
			case 1:c.area();
					break;
			case 2:c.perimeter();
					break;
			case 3:r.area();
					break;
			case 4:r.perimeter();
					break;
			case 5:System.out.println("Exiting  ");
					break;
			default:System.out.println("Enter a valid choice:  ");
					break;			
		}
		}while(a!=5);
	}
}