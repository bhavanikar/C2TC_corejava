package exception;

public class withoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int d=0,a;
      try {
    	  a=42/d;
    	  System.out.println("this will not be printed");
    	  
      }
      catch(ArithmeticException e)
      {
    	  System.out.println("division by zero");
      }
      System.out.println("this will be printed");
	}

}
