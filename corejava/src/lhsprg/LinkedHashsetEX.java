package lhsprg;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashsetEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet <String> set=new LinkedHashSet <String>();
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
