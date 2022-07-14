package throwsprg;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class ThrowsTest3 {
	private String firstName,lastName;
	void accept()throws IOException
	{
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(sr);
		System.out.println("enter your first name");
		firstName=br.readLine();
		System.out.println("enter your last name");
		lastName=br.readLine();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	}

}
