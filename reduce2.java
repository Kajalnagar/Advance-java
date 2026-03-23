// reduce 2nd way
    

import java.util.*;
import java.util.stream.*;
public class reduce2 {
    public static void main(String[] args) {
        
        List<Integer> li=List.of(10,20,3,0,56);
    Optional x = li.stream().reduce((e1, e2) ->e1+e2);
    System.out.print(x);
        
        
    }
}
