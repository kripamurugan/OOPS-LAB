import java.util.*;
public class matrix_tra
{
    public static void main(String ags[])
    {
        int m,n,c,d;
        int flag=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows  and columns of matrix");
        m=in.nextInt();
        n=in.nextInt();
        int first[][]=new int[m][n];
        int tra[][]=new int[m][n];    
        if(m==n)
        {
        System.out.println("Enter the elements of matrix");
        for(c=0;c<m;c++)
        for(d=0;d<n;d++)
        first[c][d]=in.nextInt();
        for(c=0;c<m;c++)
        for(d=0;d<n;d++)
        tra[d][c]=first[c][d];
        System.out.println("Resultant matrix After transpose\n");
        for(c=0;c<m;c++)
        {
            for(d=0;d<n;d++)
            {
                System.out.print(tra[c][d]+"\t");
            }
            System.out.println();
        }
        for(c=0;c<m;c++)
        {
            for(d=0;d<n;d++)
            {
                if(first[c][d]!=tra[c][d])
                {
                    flag=0;
                    break;
                }
            }
        }
            if(flag==1)
                System.out.println("matrix is symmtric matrix\n");
            else
                System.out.println("matrix is not symmtric matrix\n");
        }
        else
            System.out.println("Transpose of a matrix is not possible\n");
    }
}