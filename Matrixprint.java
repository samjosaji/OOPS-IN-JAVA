import java.util.Scanner;
public class Matrixprint 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row r1");
		int r1=sc.nextInt();
		System.out.println("Enter order c1");
		int c1=sc.nextInt();
		System.out.println("Enter order r2");
		int r2=sc.nextInt();
		System.out.println("Enter order c2");
		int c2=sc.nextInt();
		int i=0,j=0;
		int A[][]=new int[r1][c1];
		int B[][]=new int[r2][c2];
		//int c[][]=new int[r1][c2];
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
	}
		
		
}
