class Cons
{
	Cons()
	{
		System.out.println("constructor overloading");
	}
	Cons(int n)
	{
		if(n%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
	Cons(int a,int b)
	{
		int c=a+b;
		System.out.println("c value is "+c);
	}
}
class ConstructorOverloading
{
	public static void main(String args[])
	{
		Cons obj=new Cons();
		Cons ob=new Cons(4);
		Cons o=new Cons(3,2);
	}
}