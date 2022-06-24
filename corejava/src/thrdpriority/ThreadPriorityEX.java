package thrdpriority;

public class ThreadPriorityEX extends Thread 
{
	public void run()
	{
		System.out.println("Thread"+Thread.currentThread().getName()+"running");
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThreadPriorityEX b1=new ThreadPriorityEX();
		ThreadPriorityEX b2=new ThreadPriorityEX();
		ThreadPriorityEX b3=new ThreadPriorityEX();
		b1.start();
		b2.start();
		b3.start();
		System.out.println("priority of thread is:"+b1.getName()+"bhavani-"+b1.getPriority());
		System.out.println("priority of thread is:"+b2.getName()+"nithya-"+b2.getPriority());
		System.out.println("priority of thread is:"+b3.getName()+"amrutha-"+b3.getPriority());
		
	}
	

}
