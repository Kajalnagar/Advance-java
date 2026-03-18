import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class stream1 {
    public static void main(String[] args){
        //1. stream with array
        int arr[] = {3,4,7,89,43,89};
       IntStream s = Arrays.stream(arr);
       s.forEach(x -> System.out.println(x) );


       // 2. values
       Stream<Integer> s2 = Stream.of(2,6,45,63);// direct convert the values to string
s2.forEach(x -> System.out.println(x) );

// 3. collection
 List<Integer> list = new ArrayList<>();

List<Integer> l3 = new ArrayList<>();
l3.add(45);
l3.add(65);
l3.add(70);
l3.add(89);

Stream<Integer> s3 = l3.stream();
//s3.forEach(x -> System.out.println(x) );
//s3.forEach(x -> {

   // if(x%2 == 0)
     //   list.add(x);

//});
//System.out.println(list);

List<Integer> l4 = s3.filter(x -> x % 2 == 0).map(x -> x*x).collect(Collectors.toList());
// by using forEach
//List<Integer> s3 = l4.filter(x -> x % 2 == 0).forEach(x ->System.out.println(x);)
System.out.println(l4);
                            
        
    }
}
