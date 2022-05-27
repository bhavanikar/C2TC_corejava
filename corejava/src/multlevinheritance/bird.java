package multlevinheritance;

public class bird
{
    void fly()
    {
    	System.out.println("i am a bird");
    }
}
class parrot extends bird{
	void whatcolourami()
	{
		System.out.println("i am green!");
	}
}
class singingparrot extends parrot
{
	void whatcanising()
	{
		System.out.println("i can sing opera");
	}


	
public static void main(String[] args) {
		// TODO Auto-generated method stub
     singingparrot obj=new singingparrot();
     obj.whatcanising();
     obj.whatcolourami();
     obj.fly();
	}

}
