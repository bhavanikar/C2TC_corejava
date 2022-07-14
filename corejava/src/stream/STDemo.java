package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class STDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String>fruits=new ArrayList<String>();
        fruits.add("APPLE");
        fruits.add("CHERRY");
        fruits.add("BANNANA");
        Stream<String>Stream=fruits.stream();
        Stream<String>stringStream=Stream.map((value)->
        {return value.toLowerCase();
        });
        stringStream.forEach(System.out::println);
	}
}
        
