public class ComplexNumber{
	double real,img;
	ComplexNumber(double r,double i){
		this.real=r;
		this.img=i;
	}
public static ComplexNumber sum(ComplexNumber C1,ComplexNumber C2){
	ComplexNumber temp=new ComplexNumber(0,0);
	temp.real=C1.real+C2.real;
	temp.img=C1.img+C2.img;
	return temp;
}
public static void main(String args[]){
	ComplexNumber C1=new ComplexNumber(3.3,4);
	ComplexNumber C2=new ComplexNumber(2.4,1.5);
	ComplexNumber temp=sum(C1,C2);
	System.out.println("Sum is :"+temp.real+"+"+temp.img+"i");
	}
}