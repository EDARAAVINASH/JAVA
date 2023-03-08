class A
{
	int a=10;
	void display()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	int a=20;
	void display1()
	{
		System.out.println("child class");
		super.display();
		System.out.println(super.a);
	}
}
class C extends B
{
	int b=98;
	void dis()
	{
		int b=90;
		System.out.println(b);
		super.display1();
		System.out.println(this.b);
	}
}		
class SuperThisKeywords
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.dis();
		System.out.println(obj.a);
	}
}