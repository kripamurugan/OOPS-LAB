import java.io.*;
public class program_22
{
	public static void main(String[] args) {
		try
		{
			FileReader fr=new FileReader("num.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw1=new FileWriter("even.txt");
			BufferedWriter bw1=new BufferedWriter(fw1);
			FileWriter fw2=new FileWriter("odd.txt");
			BufferedWriter bw2=new BufferedWriter(fw2);
			String s="";
			int a=0;
			while((s=br.readLine())!=null)
			{
				a=Integer.parseInt(s);
				System.out.println(a);
				if(a%2==0)
				{
					bw1.write(Integer.toString(a));
					bw1.newLine();
				}
				else
				{
					bw2.write(Integer.toString(a));
					bw2.newLine();
				}

				bw1.flush();
				bw2.flush();
			}
			bw1.close();
			bw2.close();
		}
		catch(Exception e){}
		}
}