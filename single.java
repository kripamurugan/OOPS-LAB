import java.util.*;
class employee
{
    protected String name,address;
    protected int empid,salary;
employee(int e,String n,String a,int s)
{
    empid=e;
    name=n;
    address=a;
    salary=s;
    /*Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter employee id: ");
    empid=sc.nextInt();
    System.out.println("\nEnter employee name: ");
    name=sc.nextLine();
    System.out.println("\nEnter Monthly salary: ");
    salary=sc.nextInt();
    System.out.println("\nEnter employee address: ");
    address=sc.nextLine();
    */
}
void disp()
{
    System.out.println("\nDETAILS OF EMPLOYEE \n");
    System.out.println("----------------------------");
    System.out.println("\n\nEMPLOYEE ID:  "+empid);
    System.out.println("\nEMPLOYEE NAME:  "+name);
    System.out.println("\nSALARY:  "+salary);
    System.out.println("\nADDRESS:  "+address);

}
}
class teacher extends employee
{
    protected String dep,sub;
teacher(int e,String n,String a,int s,String d,String su)
{
    super(e,n,a,s);
    dep=d;
    sub=su;

    /*Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter teacher dept: ");
    dep=sc.nextLine();
    System.out.println("\nEnter teacher sub: ");
    sub=sc.nextLine();
    */
}
void disp()
{
    super.disp();
    System.out.println("\nDETAILS OF TEACHERS \n");
    System.out.println("----------------------------");
    System.out.println("\n\nTEACHER DEPT:  "+dep);
    System.out.println("\nTEACHER SUB:  "+sub);
    

}
}
class single
{
public static void main(String args[])
{
    int empid,salary,n;
    String name,address,dep,sub;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter number of employees: ");
    n=sc.nextInt();
    teacher t[]=new teacher[n];
    for(int i=0;i<n;i++)
    {
        System.out.println("\nEnter employee id: ");
        empid=sc.nextInt();
        System.out.println("\nEnter employee name: ");
        name=sc.next();
        System.out.println("\nEnter salary: ");
        salary=sc.nextInt();
        System.out.println("\nEnter employee address: ");
        address=sc.next();
        System.out.println("\nEnter teacher dept: ");
        dep=sc.next();
        System.out.println("\nEnter teacher sub: ");
        sub=sc.next();
        t[i]=new teacher(empid,name,address,salary,dep,sub);
    }
    for(int i=0;i<n;i++)
    {
        System.out.println("\n\nTeacher: "+(i+1));
        t[i].disp();
    }
   
}
}