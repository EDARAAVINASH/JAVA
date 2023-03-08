class Variable
{
	int a=10; //instance variable
	static int b=20; //static variable
	void display()
	{
		int c=30; //local variable
		System.out.println("local variable"+c);
	}
	public static void main(String args[])
	{
		Variable obj=new Variable();
		System.out.println("instance variable"+obj.a);
		System.out.println("static variable"+b);
		obj.display();
	
	}
}
