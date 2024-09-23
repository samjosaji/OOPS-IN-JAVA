import java.util.Scanner;
public class Fact
{
	public static void main(String arg[])
	{
		System.out.println("Enter The Number");
		Scanner a = new Scanner(System.in);
		int fact=1,i=1;
		int n = a.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;		
		}
		System.out.println("Factorial="+fact);
	}
}
		
			
