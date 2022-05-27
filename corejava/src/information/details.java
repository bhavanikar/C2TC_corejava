package information;
import java.util.Scanner;
import java.util.Scanner.*;
public class details
{

	public static void main(String args[]) 
	{
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("enter your NAME:");
        System.out.println("enter your USN:");
        System.out.println("enter your BRANCH:");
        System.out.println("enter your SEM:");
        System.out.println("enter your MARKS:");
        String a=input.nextLine();
        String b=input.nextLine();
        String c=input.nextLine();
        String d=input.nextLine();
        String e=input.nextLine();
        System.out.println("NAME:"+a);
        System.out.println("USN:"+b);
        System.out.println("BRANCH:"+c);
        System.out.println("SEM:"+d);
        System.out.println("MARKS:"+e);
        
	}

}
