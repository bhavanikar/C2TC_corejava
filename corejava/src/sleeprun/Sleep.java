package sleeprun;

public class Sleep implements Runnable {
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);}
			System.out.println("STUDENT TRAINING CLASS");
		}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Sleep we = new Sleep();
		Thread ob1= new Thread(we);
		ob1.start();

		try {
			ob1.join();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("last word");
			}

		
	}


