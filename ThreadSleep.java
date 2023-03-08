class ThreadSleep extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<3;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		ThreadSleep t1=new ThreadSleep();		
		ThreadSleep t2=new ThreadSleep();
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
	}
}