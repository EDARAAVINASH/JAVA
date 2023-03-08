class ArrayArithmeticException
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[7];
			a[21]=32;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		try
		{
			int a[]=new int[3];
			a[2]=35/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
