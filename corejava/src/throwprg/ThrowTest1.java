package throwprg;

public class ThrowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try
     {
    	 ArithmeticException a=new ArithmeticException("Hello from throw");
    	 throw a;
    	 
     }
     catch(ArithmeticException a)
     {
    	 System.out.println("ArithmeticException caught:\n"+a);
    	 System.out.println(a.getMessage());
     }
	}
	

}
