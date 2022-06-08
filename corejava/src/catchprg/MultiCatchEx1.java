package catchprg;

public class MultiCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  int arr[]=new int[6];
    	  arr[3]=20/0;
    	  System.out.println("I am in a try block");
      }
      catch(ArithmeticException ae)
      {
    	  System.out.println("A number cannot be divided by zero,illegal operation in java");
    	  
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
    	  System.out.println("Accessing array element outside of specified limit");
    	  
      }
      catch(Exception e)
      {
    	  System.out.println(e.getMessage());
      }
      System.out.println("I am out of try-catch block");
	}

}
