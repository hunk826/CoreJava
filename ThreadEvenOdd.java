package Threads;

public class ThreadEvenOdd 
{
	

	public static void main(String[] args) 
	{
		EvenNo even=new EvenNo();
		OddNo odd=new OddNo();
		
		even.start();
		odd.start();
	}
	
}
class EvenNo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i+=2) {
            System.out.println("Even thread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddNo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("Odd thread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
