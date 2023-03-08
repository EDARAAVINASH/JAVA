public class ThreadsJoining extends Thread {
	public void run() {
		for(int i=1;i<=4;i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadsJoining t1=new ThreadsJoining();
		ThreadsJoining t2=new ThreadsJoining();
		ThreadsJoining t3=new ThreadsJoining();
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();

	}

}