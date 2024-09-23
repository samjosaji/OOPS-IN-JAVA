import java.util.Scanner;
public class Matrixmultiplication 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Of First Matrix");
		int r1=sc.nextInt();
		System.out.println("Enter Coloumn Of First Matrix");
		int c1=sc.nextInt();
		System.out.println("Enter Row Of Second Matrix");
		int r2=sc.nextInt();
		System.out.println("Enter Coloumn Of Second Matrix");
		int c2=sc.nextInt();
		/*if(r1!=c2)
		{
			System.out.print("Multipilication Not Possible");
			return;
		}*/
		int i=0,j=0,k=0;
		int A[][]=new int[r1][c1];
		int B[][]=new int[r2][c2];
		int C[][]=new int[r1][c2];
		System.out.println("Enter The Elements Of The First Matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Enter The Elements Of The Second Matrix");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				B[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Product Is");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				for(k=0;k<c1;k++)
				{
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(C[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
		
		
}