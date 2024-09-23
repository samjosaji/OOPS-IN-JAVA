import java.util.Scanner;
public class PALINDROME
{
	public static void main(String[] args)
	{
		System.out.print("Enter The String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		int flag=0;
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Palidrome");
		}
		else
		{
			System.out.println("Not Palidrome");
		}
		
	}
}
		
