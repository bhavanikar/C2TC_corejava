package JBR;

import java.io.*;
public class BufferedReaderExample
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        
        System.out.println("enter your name");
        String name=br.readLine();
        System.out.println("your name:"+"\t"+name);
	}

}
