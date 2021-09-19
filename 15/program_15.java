import java.util.*;
public class program_15
{
public static void main(String[] args)
{
	int n,i,c,s=0;
	int count=0;
	float a=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of N :");
	n=sc.nextInt();
	System.out.println("Enter "+n+" numbers:");
	for(i=0;i<n;i++)
	{
		c=sc.nextInt();
		try
		{
			if(c<0)
			{	
				n++;
				count++;
				throw new MyEx("Negative not allowed");
			}
			else{
				s+=c;
			}
		}
		catch(MyEx e)
		{
			System.out.println(e);
		}
	}
	n=n-count;
	a=s/n;
	System.out.println("SUM: "+s);
	System.out.println("AVERAGE: "+a);
}
}