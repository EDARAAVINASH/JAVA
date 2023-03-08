class THreadGetSetPriority extends Thread
{
	public void run()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("thread is "+i);
		}
	}
	public static void main(String args[])
	{
		THreadGetSetPriority thread1=new THreadGetSetPriority();
		thread1.run();
		THreadGetSetPriority thread2=new THreadGetSetPriority();
		thread2.run();
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		thread1.setName("set name");
		System.out.println(thread1.getName());
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		thread2.setPriority(MAX_PRIORITY);
		System.out.println(thread2.getPriority());
	}
}

		
		
		
		
