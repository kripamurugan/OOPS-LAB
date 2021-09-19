import java.util.*;
class mult extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("5 * "+i+" = "+(5*i));
			//try { Thread.sleep(1000); } catch ( Exception e) {}
		}
	}
}
class prime extends Thread
{
	public void run()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Limit ");
	int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{	
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0&&i!=1)
				{
					System.out.print(i+" ");
				}
		}
	}
}

public class program_16
{	
	public static void main(String[] args)
	{
		mult m=new mult();
		m.start();
		prime p=new prime();
		p.start();

	}
}