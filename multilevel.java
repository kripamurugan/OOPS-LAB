import java.util.*;
class person 
{
    protected String na,ge,add;
    protected int ag;
    person()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter person name: ");
        na=sc.next();
        System.out.println("\nEnter person gender: ");
        ge=sc.next();
        System.out.println("\nEnter person address: ");
        add=sc.next();
        System.out.println("\nEnter age: ");
        ag=sc.nextInt();
    }
    void disp()
{
    System.out.println("\nDETAILS OF person \n");
    System.out.println("----------------------------");
    System.out.println("\nPERSON NAME:  "+na);
    System.out.println("\nPERSON GENDER:  "+ge);
    System.out.println("\nADDRESS:  "+add);
    System.out.println("\nPERSON AGE:  "+ag);

}
}
class employee extends person
{
    protected String c_name,qu;
    protected int empid,salary;
employee()
{
    
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter employee id: ");
    empid=sc.nextInt();
    System.out.println("\nEnter company name: ");
    c_name=sc.next();
    System.out.println("\nEnter salary: ");
    salary=sc.nextInt();
    System.out.println("\nEnter employee qualification: ");
    qu=sc.next();
    
}
void disp()
{
    super.disp();
    System.out.println("\nDETAILS OF EMPLOYEE \n");
    System.out.println("----------------------------");
    System.out.println("\n\nEMPLOYEE ID:  "+empid);
    System.out.println("\nCOMPANY NAME:  "+c_name);
    System.out.println("\nSALARY:  "+salary);
    System.out.println("\nQUALIFICATION:  "+qu);

}
}
class teacher extends employee
{
    protected String dep,sub;
    protected int t_id;
teacher()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter teacher id: ");
    t_id=sc.nextInt();
    System.out.println("\nEnter teacher dept: ");
    dep=sc.next();
    System.out.println("\nEnter teacher sub: ");
    sub=sc.next();
    
}
void disp()
{
    super.disp();
    System.out.println("\nDETAILS OF TEACHERS \n");
    System.out.println("----------------------------");
    System.out.println("\n\nTEACHER ID:  "+t_id);
    System.out.println("\n\nTEACHER DEPT:  "+dep);
    System.out.println("\nTEACHER SUB:  "+sub);
    

}
}
class multilevel
{
public static void main(String args[])
{
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter number of teachers: ");
    n=sc.nextInt();
    teacher t[]=new teacher[n];
    for(int i=0;i<n;i++)
    {
        t[i]=new teacher();
    }
    for(int i=0;i<n;i++)
    {
        System.out.println("\n\nTeacher: "+(i+1));
        t[i].disp();
    }
   
}
}