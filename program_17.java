import java.util.*;
class fib implements Runnable
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limit To Fibonacci Series ");
		int n2=sc.nextInt();
		int a=0,b=1,c=0;
		System.out.println("Fibonacci Series ");
		while(c<=n2)
		{
			a=b;
			b=c;
			System.out.println(c);
			c=a+b;
			//try { Thread.sleep(1000); } catch ( Exception e) {}
		}
	}
}
class even implements Runnable
{
	public void run()
	{
	Scanner sc=new Scanner(System.in);
	try { Thread.sleep(3000); } catch ( Exception e) {}
	System.out.println("Enter the starting Range ");
	int n1=sc.nextInt();
	try { Thread.sleep(3000); } catch ( Exception e) {}
	System.out.println("Enter the Ending Range ");
	int n3=sc.nextInt();
		for(int i=n1;i<=n3;i++)
		{	
				if(i%2==0)
				{
					System.out.print(i+" ");
				
				}
		}
	}
}

public class program_17
{	
	public static void main(String[] args)
	{
		fib f=new fib();
		Thread T1=new Thread(f);
		//T1.start();
		even e=new even();
		Thread T2=new Thread(e);
		T1.start();
		T2.start();

	}
}