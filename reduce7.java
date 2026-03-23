import java.util.*;
import java.util.stream.*;
// sum of all even numbers using reduce()
public class reduce7 {
    public static void main(String[] args) {
        List<Integer>li=List.of(10,20,30,40,50);
       int sumeven = li.stream().filter(n -> n % 2 == 0).reduce(0, (e1, e2) -> e1 + e2);
    System.out.println(sumeven);
    }
}    
