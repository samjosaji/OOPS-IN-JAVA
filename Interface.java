import java.util.Scanner;
interface Human{
	final int jobid=1050;
	void learn(String str);
	void work();
}
interface Recruitment{
	void Screening(int score);
	
}
class Programmer implements Human,Recruitment
{
	public void learn(String str)
	{
		System.out.println("My Trained Area:"+str);
	}

	public void Screening(int score)
	{
		System.out.println("Test Score:"+score);
	
	}
	public void work()
	{
		System.out.println("Selected To The Role Development");
	}
}

public class Interface {
	
	public static void main(String[] args) {
		Programmer trainee=new Programmer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Trained Area:");
		String str=sc.nextLine();
		System.out.println("Enter Your Test Score:");
		int score=sc.nextInt();
		System.out.println("......About My Placement.......");
		trainee.learn(str);
		trainee.Screening(score);
		trainee.work();
		System.out.println("My JobId is:"+trainee.jobid);
		sc.close();
	}

}
