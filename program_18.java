import java.util.*;
public class program_18
{
	public static void main(String[] args) {
	    //int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		String s;
		int i,n;
	    ArrayList<String> ar=new ArrayList<String>();
		do
		{
		System.out.println("\n1.ADD STRING\n2.REMOVE STRING\n3.REPLACE STRING\n4.GET ARRAY SIZE\n5.GET STRING ON SPECIFIED INDEX\n6.DISPLAY ARRAY LIST\n7.DISPLAY ARRAY ELEMENTS ONE BY ONE\n8.SORT ARRAY\n9.EXIT\n");
	    System.out.println("Enter Your Choice\n");
		n=sc.nextInt();
		switch(n)
		{
			case 1:System.out.println("Enter string\n");
					s=sc.next();
					ar.add(s);
					System.out.println("ARRAY LIST IS "+ar);
					break;
			case 2:int d=ar.size();
					System.out.println("Enter Index to remove\n");
					i=sc.nextInt();
					if(d>i){
					ar.remove(i);
					}
					else
					{
					System.out.println("Removal not possible");
					}
					System.out.println("ARRAY LIST IS "+ar);
					break;
			case 3:System.out.println("Enter string to insert\n");
					s=sc.next();
					int g=ar.size();
					System.out.println("Enter Index to replace\n");
					i=sc.nextInt();
					if(g>i){
					ar.set(i,s);
					}
					else
					{
					System.out.println("Replace not possible");
					}
					System.out.println("ARRAY LIST IS "+ar);
					break;
			case 4:System.out.println("Array Size\n");
					System.out.println(ar.size());
					break;		
			case 5:int f=ar.size();
					System.out.println("Enter Index to get the specified  index string");
					i=sc.nextInt();
					if(f>i){
					System.out.println("STRING IS "+ar.get(i));
					}
					else
					{
					System.out.println("Index is OutOfBound");
					}
					break;
			case 6:System.out.println("ARRAY LIST IS "+ar);
					break;	
			case 7:for(String e:ar)
						System.out.println(e);
			case 8:Collections.sort(ar);
					System.out.println(ar);
			case 9:break;
			
		}
		}
		while(n!=9);
	}
}