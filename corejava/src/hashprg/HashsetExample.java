package hashprg;
import java.util.*;
public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 HashSet <String> set=new HashSet <String>();
     set.add("NITHYA");
     set.add("BHAVANI");
     set.add("AMRUTHA");
     set.add("AKASH");
     set.add("null");
     System.out.println(set); 
     Iterator<String>str=set.iterator();
     while(str.hasNext())
     {
    	 System.out.println(str.next());
     }
     System.out.println(set);
     set.remove("BHAVANI");
     System.out.println(set);
     
     
     
     
	}

}
