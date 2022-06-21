package arraylistprg;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String>list=new ArrayList<String>();
      System.out.println("adding elements to end of the list");
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");
      list.add("E");
      list.add("G");
      System.out.println("arraylist insertion order:"+list);
      System.out.println("adding an element at a specific index after B element");
      list.add(2,"H");
      System.out.println("ArrayList insertion order after adding C:"+list);
      System.out.println("addition of element at a specific after E");
      list.add(5,"F");
      System.out.println("ArrayList insertion order after adding F:"+list);
      list.remove(2);
      
	}

}
