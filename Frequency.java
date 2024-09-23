import java.util.Scanner;
public class FEQ
{
	public static void main(String[] args)
	{
		System.out.print("Enter The String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.print("Enter The Letter To Search");
		char ch=sc.nextLine().charAt(0);
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		
		System.out.println("No of occurance is"+count);
		
	}
}
		
