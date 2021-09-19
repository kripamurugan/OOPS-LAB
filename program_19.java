import java.util.*;
public class program_19
{
	public static void main(String[] args) {
	    //int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		String s;
		int i,n;
	    LinkedList<String> lst=new LinkedList<String>();
		do
		{
		System.out.println("\n1.ADD STRING\n2.REMOVE ALL ELEMENTS\n3.DISPLAY LINKED LIST\n4.DISPLAY ELEMENTS ONE BY ONE\n5.EXIT\n");
	    System.out.println("Enter Your Choice\n");
		n=sc.nextInt();
		switch(n)
		{
			case 1:System.out.println("Enter string\n");
					s=sc.next();
					lst.add(s);
					System.out.println("LINKED LIST IS "+lst);
					break;
			case 2:
					lst.clear();
					System.out.println("LINKED LIST IS "+lst);
					System.out.println("LINKED LIST IS EMPTY");
					break;
			case 3:System.out.println("LINKED LIST IS "+lst);
					break;	
			case 4:for(String e:lst)
						System.out.println(e);
			case 5:break;
			
		}
		}
		while(n!=5);
	}
}