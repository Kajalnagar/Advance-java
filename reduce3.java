
import java.util.*;
import java.util.stream.*;
public class reduce3 {
    public static void main(String[] args) {
        
        List<Integer> li=List.of(10,20,3,40,56);
    
       int sum = li.stream().reduce(0,(e1,e2) -> e1+e2);
       // product 
    int mul = li.stream().reduce(1,(e1,e2) -> e1*e2);
        System.out.println(sum);
        System.out.println(mul);
    }
}
