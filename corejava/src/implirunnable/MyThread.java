package implirunnable;

public class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("New thread is running");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        System.out.println("Main thread is running");
        MyThread b=new MyThread();
        Thread k=new Thread(b);
        k.start();
        
	}

}
