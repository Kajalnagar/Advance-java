
import java.util.*;
import java.util.stream.*;
// count total elements using reduce() without using count()
public class reduce6 {
    public static void main(String[] args) {
        List<Integer> li = List.of(10, 20, 30, 40, 50);
    int count = li.stream().reduce(0, (c, e) -> c + 1);

        System.out.println("Total elements = " + count);
    }
}
