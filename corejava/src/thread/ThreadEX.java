package thread;

public class ThreadEX implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThreadEX yield1=new ThreadEX();
		Thread b1=new Thread(yield1,"HI");
		
		ThreadEX yield2=new ThreadEX();
		Thread b2=new Thread(yield2,"WI");
		b1.start();
		b2.start();
	}

}
