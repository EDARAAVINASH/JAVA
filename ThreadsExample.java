class B extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread A is "+i);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int j=0;j<5;j++)
		{
			System.out.println("Thread B is "+j);
		}
	}
}
class ThreadsExample
{
	public static void main(String args[])
	{
		B obj=new B();
		C ob=new C();
		obj.start();
		ob.start();
	}
}