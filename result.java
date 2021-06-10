import java.util.*;
interface student
{
	public void s_read();
	public void s_disp();
}
interface sports
{
	public void sp_read();
	public void sp_disp();
}
class results implements student,sports
{
	String n,g,r,i;
	int m;
	public void s_read()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("--------    Enter student details    ---------");
		System.out.println("Enter student name:  ");
		n=sc.nextLine();
		System.out.println("Enter student grade:  ");
		g=sc.nextLine();
		System.out.println("Enter student mark:  ");
		m=sc.nextInt();
		

	}
	public void s_disp()
	{
		System.out.println("Student name:  "+n);
		System.out.println("Student mark:  "+m);
		System.out.println("Student grade:  "+g);
	}
	public void sp_read()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("------      Enter student sports details     -------");
		System.out.println("Enter student participating sports item:  ");
		i=sc.nextLine();
		System.out.println("Enter student result:  ");
		r=sc.nextLine();

	}
	public void sp_disp()
	{
		System.out.println("Student participating sports item:  "+i);
		System.out.println("Student result:  "+r);
	
	}
}
class result
{
	public static void main(String args[])
	{
		results r=new results();
		r.s_read();
		r.s_disp();
		r.sp_read();
		r.sp_disp();
	}
}