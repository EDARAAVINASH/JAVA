class Grandfather
{
	int gprop=100;
	void Gshow()
	{
		System.out.println("this is grandfather class");
	}
}
class Father extends Grandfather
{
	int fprop=200;
	void Fshow()
	{
		System.out.println("this is father class");
		System.out.println("father property is"+(gprop+fprop));
	}
}
class Son extends Father
{
	int sprop=300;
	void Sshow()
	{
		System.out.println("this is son class");
		System.out.println("son property is"+(gprop+fprop+sprop));
	}
}
class MultilevelInheritance
{
	public static void main(String args[])	
	{
		Son s=new Son();
		s.Sshow();
		s.Fshow();
		s.Gshow();
	}
}