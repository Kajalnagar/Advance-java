import java.util.*;
import java.util.stream.*;
public class reduce {
    public static void main(String[] args) {
        
        List<Integer> li=List.of(10,20,3,0,56);
    li.stream().reduce((e1, e2) ->e1+e2).ifPresent(System.out::println);
        
        
    }
}
