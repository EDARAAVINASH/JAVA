public class SynchronizationExample implements Runnable
{
	int tickets=3;
	synchronized public void bookticket(String name,int wantedtickets) 
	{
		if(wantedtickets<=tickets) 
		{
			System.out.println(wantedtickets+" booked to "+name);
			tickets=tickets-wantedtickets;
		}
		else 
		{
			System.out.println("No tickets to book for "+name);
		}
	}
	public void run() 
	{
		String name=Thread.currentThread().getName();
		if(name.equals("t1")) 
		{
			bookticket(name,1);
		}
		else if(name.equals("t2")) 
		{
			bookticket(name,2);
		}
		else 
		{
			bookticket(name,3);
		}
	}
	public static void main(String[] args) 
	{
		SynchronizationExample f=new SynchronizationExample();
		
	Thread t1=new Thread(f);
	Thread t2=new Thread(f);
	Thread t3=new Thread(f);
	
	t1.setName("t1");
	t2.setName("t2");
	t3.setName("t3");
	
	t1.start();
	t2.start();
	t3.start();
	}
}