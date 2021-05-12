import java.util.*;
class cpu
{
    int price;
    public void cpu_disp()
        {
         
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the cpu price");
            price=Integer.parseInt(in.nextLine());
            System.out.println("The cpu price is  "+price);
        }
    public class processor
    {
        int n;
        String m;
        public void read()
        {
         
            Scanner in=new Scanner(System.in);
            System.out.println("Enter no of cores of processor");
            n=Integer.parseInt(in.nextLine());
            System.out.println("Enter processor manifacture");
            m=in.nextLine();
        }
        public void disp()
        {
            System.out.println("No of Cores of processor   "+n);
            System.out.println("processor manifacturer   "+m);
            System.out.println("price of cpu    " +price);
        }
    }
    static class ram
    {
        String mem,mani_ram;
        ram()
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter Ram memory");
            mem=in.nextLine();
            System.out.println("Enter Ram manifacturer");
            mani_ram=in.nextLine();
        }
        public void disp()
        {
            System.out.println("Ram memory     "+mem);
            System.out.println("Ram manifacturer   "+mani_ram);
        }
    }
}
class main
{
    public static void main(String[] args)
    {
        cpu c=new cpu();
        c.cpu_disp();
        cpu.processor p = c.new processor();
        p.read();
        p.disp();
        cpu.ram r=new cpu.ram();
        r.disp();
    }
}