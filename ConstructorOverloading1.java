class A
{
	void sum(int x,int y)
	{
		int z=x+y;
		System.out.println("sum is "+z);
	}
	void sum(double x,double y)
	{
		double z=x+y;		
		System.out.println("sum is equals to "+z);
	}
}
class ConstructorOverloading1
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.sum(3,4);
		obj.sum(3.4,5.6);
	}
}