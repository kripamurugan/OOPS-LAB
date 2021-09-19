import arithmetic.*;
import java.util.*;
public class arith_pack implements arithmetic.substraction,arithmetic.multiplication
{
	public void sub(float l,float b)
	{
	System.out.println("Difference: "+(l-b));
	}
	public void mul(float l,float b)
	{
	System.out.println("Product:"+(l*b));
	}
	public static void main(String[] args)
	{
	int ch;
	Scanner sc=new Scanner(System.in);
	do
	{
	System.out.println("Enter First Number");
	float l=sc.nextFloat();
	System.out.println("Enter Second Number");
	float b=sc.nextFloat();
	arith_pack ap=new arith_pack();
	System.out.println("1.ADD\n2.SUB\n3.DIV\n4.MUL\n5.EXIT\n");
	System.out.println("Enter Your Choice");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1: addition a=new addition();
			System.out.println("Sum : "+a.add(l,b));
			break;
	case 2: ap.sub(l,b);
			break;
	case 3: division d=new division();
			System.out.println("Qutioent : "+d.div(l,b));
			break;
	case 4: ap.mul(l,b);
			break;
	case 5: break;
	}
	}while(ch!=5);
	}
}