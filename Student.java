public class Student
{
	int no;
	String name;
	Student(int n,String na)
	{
		no=n;
		name=na;
	}
	void display()
	{
		System.out.println("name is "+name+"and number is "+no);
	}
	public static void main(String args[])
	{
		Student s=new Student(86,"avinash");
		s.display();
	}
}