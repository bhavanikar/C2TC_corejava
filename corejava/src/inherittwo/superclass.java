package inherittwo;

class Superclass 
{
    void display()
    {
    	System.out.println("i am a super class");
    	
    }
public class Subclass extends Superclass
{
	void display2()
	{
		System.out.println("i am a sub class");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Superclass obj= new Superclass();
         obj.display();
        // obj.display2();
	}

}
