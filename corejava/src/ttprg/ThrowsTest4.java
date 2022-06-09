package ttprg;
import java.io.IOException;
public class ThrowsTest4 {
	static void display()throws IOException
	{
		System.out.println("Hello java");
		throw new IOException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsTest4 obj=new ThrowsTest4();
		try
		{
			obj.display();
		}
		catch(IOException e)
		{
			System.out.println("caught an excetion:\n"+e);
		}
	}

}
