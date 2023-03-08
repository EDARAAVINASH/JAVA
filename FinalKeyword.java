final class A
{
	final int a=10;
	final void run()
	{
		a=20;
		System.out.println("value of a is "+a);
	}	
	void run()
	{
		a=30;
		System.out.println("value of a is "+a);
	}
}
class B extends A
{
	void run()
	{
		System.out.println("hello");
	}
}
class FinalKeyword
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.run();
		obj.run();
	}
}
	