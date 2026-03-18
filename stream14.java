import java.util.List;
// limit()
public class stream14limi {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10,30,40,45,56,10,6,89);
        // with foreach()
//l1.stream().distinct().forEach(System.out::println);
List<Integer> l2=l1.stream().distinct().skip(2).limit(4).toList();  
System.out.println(l2);
}
    
}
