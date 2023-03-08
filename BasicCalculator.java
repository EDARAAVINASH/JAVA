import java.util.*;
class BasicCalculator
{
	void mySum(int x,int y)
	{
		System.out.println("The addition is "+(x+y));
	}
	void mySub(int x,int y)
	{
		System.out.println("The subraction is "+(x-y));
	}
	void myMul(int x,int y)
	{
		System.out.println("The Multiplication is "+(x*y));
	}
	void myDiv(int x,int y)
	{
		System.out.println("The Division is is "+(x/y));
	}
	public static void main(String args[])
	{
		int a,b;
		BasicCalculator c=new BasicCalculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		c.mySum(a,b);
		c.mySub(a,b);
		c.myMul(a,b);
		c.myDiv(a,b);
	}
}