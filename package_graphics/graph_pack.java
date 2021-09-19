import graphics.*;
import java.util.*;
public class graph_pack implements graphics.square,graphics.circle
{
	public void area_sq(float s)
	{
	System.out.println(s*s);
	}
	public void area_cir(float d)
	{
	System.out.println(3.14*d*d);
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("----RECTANGLE----");
	System.out.println("Enter Length");
	float l=sc.nextFloat();
	System.out.println("Enter Breadth");
	float b=sc.nextFloat();
	rectangle r=new rectangle();
	System.out.println("AREA");
	System.out.println(r.area_rect(l,b));
	System.out.println("----SQURAE----");
	System.out.println("Enter A Side");
	float s=sc.nextFloat();
	graph_pack gp=new graph_pack();
	System.out.println("AREA");
	gp.area_sq(s);
	System.out.println("----TRIANGLE----");
	System.out.println("Enter Base");
	double c=sc.nextDouble();
	System.out.println("Enter Height");
	double h=sc.nextDouble();
	triangle t=new triangle();
	System.out.println("AREA");
	System.out.println(t.area_tri(c,h));
	System.out.println("----CIRCLE----");
	System.out.println("Enter Radius");
	float d=sc.nextFloat();
	System.out.println("AREA");
	gp.area_cir(d);
	}
}