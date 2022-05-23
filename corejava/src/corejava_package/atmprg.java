package corejava_package;
abstract class atm
{
	abstract void withdraw();
}

public class atmprg extends atm 
{
	void withdraw()
	{
		System.out.println("withdraw succesfull");
	}
     public static void main(String[] args)
     {
    	 atmprg ob1=new atmprg();
    	 ob1.withdraw();
     }
}
