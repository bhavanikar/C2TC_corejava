package streamex1;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Optional;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>numbers=new ArrayList<Integer>();
	        numbers.add(100);
	        numbers.add(101);
	        numbers.add(103);
	        numbers.add(109);
	        System.out.println(numbers);
	        Stream<Integer>stream=numbers.stream();
	        Optional<Integer>sum=stream.reduce(Integer::sum);
	        System.out.println("ans="+sum.get());
	        
	}

}
