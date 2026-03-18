import java.util.List;

public class stream13skip {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10,30,40,45,56,10,6,89);
        
List<Integer> l2=l1.stream().distinct().skip(3).toList();  
System.out.println(l2);
}
}
