class Circle
{
	void area(int r)
	{
		System.out.println("area is "+3.14*r*r);
	}
}
class Square
{
	void area(int s)
	{
		System.out.println("area is "+s*s);		
	}
}
class Rectangle
{
	void area(int l,int b)
	{
		System.out.println("area is "+l*b);
	}
}
class Area
{
	public static void main(String args[])
	{
		Rectangle obj=new Rectangle();
		obj.area(4,5);
		Circle o=new Circle();
		o.area(5);
		Square j=new Square();
		j.area(4);
	}
}