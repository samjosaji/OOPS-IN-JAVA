public class Prime
{
	public static void main(String[] args)
	{
		int i,count=0;
		for(i=0;i<100;i++)
		{
			if(i%10!=0)
			{
				count++;
			}
			if(count<=3)
			{
				System.out.println(i);
			}
				
		}
	}
}
		
