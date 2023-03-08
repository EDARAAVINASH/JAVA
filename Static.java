class Static 
{
	static void static(int a,int b)
	{
		System.out.println("this is static method");
		System.out.println("a is "+a+"b is "+b);
	}
	void nonstatic(String name)
	{
		System.out.println("this is non static method");
		System.out.println("name is "+name);
	}
	public static void main(String args[])
	{
		static(1,3);
		Static obj=new Static();
		obj.nonstatic("ganesh");
	}
}	