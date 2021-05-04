public class Product{
	String pcode;
	String pname;
	int price;
	public Product(String pcode_get,String pname_get,int price_get){
	pcode=pcode_get;
	pname=pname_get;
	price=price_get;
	}
	public int getprice(){
		return price;
	}
	public static void main(String[]args){
		Product p1=new Product("A","bat",43);
		Product p2=new Product("B","ball",5);
		Product p3=new Product("C","cap",20);
		if(p1.price<=p2.price&&p1.price<=p3.price){
			System.out.println("lowest price="+p1.pname);
		}
		if(p2.price<=p1.price&&p2.price<=p3.price){
			System.out.println("lowest price="+p2.pname);
		}
		if(p3.price<=p1.price&&p3.price<=p2.price){
			System.out.println("lowest price="+p3.pname);
		}
	}
}
		