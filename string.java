import java.util.Scanner;
import java.io.*;
class string
{
	void count(String s)
	{
		String b[]=s.split(" ");
		
		for (int i=0; i<b.length;i++) 
		{
        		int count=0;
			for (int j=0;j<b.length;j++)
	 		{
            			String temp=b[j];
            			String temp1=b[i];
            			if (j<i&&temp.contentEquals(temp1)) 
				{	
					break;
				}
				if(temp.contentEquals(temp1))
				{
					count=count+1;
				}
            			if (j==b.length-1) 
				{
            				System.out.println(b[i]+"  "+count+" times");
           			}

        		}
		}
	}
	void replace(String s)
	{
		Scanner r=new Scanner(System.in);
		System.out.print("Enter a word need to replace:");
		String re=r.nextLine();
		System.out.print("Enter a word need to place:");
		String word=r.nextLine();
		String b[]=s.split(" ");
		for(int i=0;i<b.length;i++)
		{
			if(re.equals(b[i]))
			{	
				b[i]=word;
			}
			
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

	void reverse(String s)
	{
		byte[] b=s.getBytes();
		byte[] result=new byte[b.length];
		for(int i=0;i<b.length;i++)
		{
			result[i]=b[b.length-i-1];
		}
		System.out.println(new String(result));
	}

public static void main(String[] args)
{
	String s;
	int n;
	Scanner a=new Scanner(System.in);
	System.out.print("Enter a String:");
	s=a.nextLine();
	string st=new string();
	do
	{
		System.out.println("\n-----STRING OPERATIONS-----");
		System.out.println("1.COUNT");
		System.out.println("2.REPLACE");
		System.out.println("3.REVERSE");
		System.out.println("0.EXIT");
		System.out.print("\nenter your choice:");
		n=a.nextInt();

	switch(n)
	{
		case 1:
		st.count(s);
		break;
		case 2:
		st.replace(s);
		break;
		case 3:
		st.reverse(s);
		break;
		case 0:
		System.out.println("EXIT");
		break;
		default:
		System.out.print("Incorrect ! enter valid number");
	}
	}
while(n>0);
}
}