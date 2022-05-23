package corejava_package;
class withdraw {
	
	int amt_withdraw=300;
	int amt_left=6000;
    }
  public class withdrawprg  extends withdraw
  {
	  int amt_left=6000;
	     public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	 withdraw ob1=new withdraw();
	    	  System.out.println("amount withdraw"+ob1.amt_withdraw);
	    	  System.out.println("amount_left"+ob1.amt_left);   	 
	}

}




