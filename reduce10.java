
import java.util.*;

public class reduce10 {
    public static void main(String[] args) {
        List<Integer> li = List.of(1, 2, 3, 4, 5);

       // concentened all string
       int sum = li.stream()
                    .reduce((e1, e2) -> e1 + e2)
                    .orElse(0);   // handle Optional
System.out.println(sum);
    }
}
