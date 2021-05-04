public class Student{
	String name;
	int rollno;
	int mark;
	public Student(String name_get,int rollno_get,int mark_get){
	name=name_get;
	rollno=rollno_get;
	mark=mark_get;
	}
	public int getmark(){
		return mark;
	}
	public static void main(String[]args){
		Student S1=new Student("A",1,43);
		Student S2=new Student("B",2,5);
		Student S3=new Student("C",3,20);
		if(S1.mark>=S2.mark&&S1.mark>=S3.mark){
			System.out.println("Highest Mark="+S1.mark);
		}
		if(S2.mark>=S1.mark&&S2.mark>=S3.mark){
			System.out.println("Highest Mark="+S2.mark);
		}
		if(S3.mark>=S1.mark&&S3.mark>=S2.mark){
			System.out.println("Highest Mark="+S3.mark);
		}
	}
}
		