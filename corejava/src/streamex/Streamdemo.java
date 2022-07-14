package streamex;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class Streamdemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        List<Integer>numbers=new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(101);
        numbers.add(103);
        numbers.add(109);
        List<Integer>newlist=numbers.stream().filter(n->n>101).collect(Collectors.toList());
        System.out.println(newlist);
	}

}
