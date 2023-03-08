interface a
{
	void speed();
}
interface b
{
	void distance();
}
class C implements a,b
{
	public void speed()
	{		
		System.out.println("speed");
	}
	public void distance()
	{
		System.out.println("distance1");
	}
}
class InterfaceExample
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.speed();
		obj.distance();
	}
}