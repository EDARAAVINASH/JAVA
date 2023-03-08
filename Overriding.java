class A
{
	public void sum(int x,int y)
	{
		int z=x+y;
		System.out.println("z is "+z);
	}
}
class Overriding extends A
{
	public void sum(int x,int y)
	{
		int z=x+y;
		System.out.println("sum is "+z);
	}
	public static void main(String args[])
	{
		A6 obj=new A6();
		obj.sum(4,5);
	}
}
		