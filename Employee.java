import java.util.*;
 class Employee{
	private String ID;
	private String name;
	private double monthlysalary;
	public Employee(String N, double M){
		name=N;
		if(M<0){
			monthlysalary=0;
		}
		else monthlysalary=M;
		}
public String getID(){
	return ID;
	}
public void setID(String id){
	ID=id;
	}
public String getname(){
	return name;
	}
public void setname(String Nname){
	name=Nname;
	}

public double getmonthlysalary(){
	return monthlysalary;
	}
public void setmonthlysalary(double M){
	if(M<0){
		monthlysalary=0;
	}
	else monthlysalary=M;
	}
public static void main(String[]args){
	 Scanner S =new Scanner(System.in);
	System.out.println("Enter the Name:");
	String Nname=S.next();
	System.out.println("Enter the salary:");
	double monthlysalary=S.nextDouble();
	Employee e = new Employee(Nname,monthlysalary);
	System.out.println("Yearly Salary of "+e.getname()+":");
	System.out.println(e.getmonthlysalary()*12);
	double newsalary=e.getmonthlysalary()*0.1+e.getmonthlysalary();
	e.setmonthlysalary(newsalary);
	System.out.println("New Yearly Salary Of "+e.getname()+":");
	System.out.println(e.getmonthlysalary()*12);
	e.getmonthlysalary();
	}
}

	