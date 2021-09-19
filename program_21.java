import java.io.*;
import java.util.*;
public class program_21
{
	public static void main(String[] args) {
		//Reading from a file
		try
		{
			FileReader fr=new FileReader("hi.txt");
			BufferedReader br=new BufferedReader(fr);
			String s="";
			FileWriter fw=new FileWriter("hello.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			while((s=br.readLine())!=null)
			{
				System.out.println(s);
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			bw.close();
			br.close();
		}
		catch(Exception e){}
		}
}