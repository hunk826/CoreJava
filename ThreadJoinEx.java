package Threads;

public class ThreadJoinEx extends Thread
{
	@Override
	public void run()
	{
		for (int i=1;i<=3;i++) {
			System.out.println("Thread"+Thread.currentThread().getId()+": "+i+" started.");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}


}


class MyRun 
{
	public static void main(String[] args) 
	{
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		Mythread t3=new Mythread();
		
		
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("All threads are Finished.");
	}
	
	
}
