package threadprg;
import java.util.*;
//import java.util.Thread;
public class ThreadEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Thread obj=Thread.currentThread();
      System.out.println("current thread is"+obj);
      System.out.println("name of current thread is:"+obj.getName());
      obj.setName("CAPGEMINI");
      System.out.println("name of the thread after changing name is:"+obj);
      System.out.println("main thread  is existing");
      
	}

}
