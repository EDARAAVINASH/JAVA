import java.util.*;
class CountWords
{
	
	public static void main(String args[])
	{
		int charac=0,word=0,space=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String sr=s.nextLine();
		for(int i=0;i<sr.length();i++)
		{
			if(sr.charAt(i)==' ')
			{
				space++;
			}
			if(sr.charAt(i)!=' ')
			{
				charac++;
			}
			word=space+1;
		}
		System.out.println("characters="+charac);
		System.out.println("words="+word);
		System.out.println("spaces="+space);
	}
}
		