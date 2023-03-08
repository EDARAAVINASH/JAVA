import java.util.*;
import java.lang.*;
public class SortingStrings
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the no of words");
		n=s1.nextInt();
		String s[]=new String[n];
		System.out.println("enter the names");
		for(i=0;i<n;i++)
		{
			s[i]=s1.next();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("sorted list of names");
		for(i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}