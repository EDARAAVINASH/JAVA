
class Example 
{
  Example() 
  {
  	System.out.println("Inside Default");
  }
  Example(int n) 
  {
  	this();
     System.out.println("Inside Parameterized");
  }
}
public class ThisExample 
{
	public static void main(String arg[]) 
	{
     	Example obj = new Example(24);
  	}
}