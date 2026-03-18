import java.util.List;

public class stream15 {
    // print even number with limit 3
     public static void main(String[] args) {
        List<Integer> l1 = List.of(10,30,40,45,56,10,6,89);
List<Integer> l2=l1.stream().filter(n -> n%2==0).limit(3).toList();  
System.out.println(l2);
}
}
