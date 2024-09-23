import java.util.Scanner;
class Method
{
	void area(double r)
	{
		System.out.println("The Area Of Circle="+3.14*r*r);
	}
	void area(int a,int b)
	{
		System.out.println("Area Of Rectangle="+a*b);
	}
	void area(double be,double h)
	{
		System.out.println("Area Of Triangle"+0.5*be*h);
	}
}
public class MethodoOverloading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Method m=new Method();
		System.out.println("Enter The Radius Of The Circle");
		double r=sc.nextDouble();
		m.area(r);
		System.out.println("Enter The Length And Breadth Of Rectangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		m.area(a,b);
		System.out.println("Enter The Base And Height Of Triangle");
		double be=sc.nextDouble();
		double h=sc.nextDouble();
		m.area(be,h);
		sc.close();
		}
	

}
