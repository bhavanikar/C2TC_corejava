package exceptionHandling;

public class ExceptionHandlingwithTryCatch 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("One");
     System.out.println("Two");
     try
     {
    	 System.out.println("Before device");
    	 int a=1/0;
    	 System.out.println("After devide");
    	 
     }
     catch(ArithmeticException e)
     {
    	 System.out.println("A number cannot be devided by zero");
     }
     System.out.println("Three");
     System.out.println("Four");
	}

}
