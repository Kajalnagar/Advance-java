
import java.util.*;
import java.util.stream.*;
public class reduce4 {
    public static void main(String[] args) {
        
        List<Integer> li=List.of(10,20,3,40,56);
    
      
       // product  of list
    int mul = li.stream().reduce(1,(e1,e2) -> e1*e2);
      
        System.out.println(mul);
    }
}
