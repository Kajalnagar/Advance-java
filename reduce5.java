import java.util.*;
import java.util.stream.*;

public class reduce5 {
    public static void main(String[] args) {
        List<Integer> li = List.of(10, 20, 30, 40, 50);

        // maximum value
        int max = li.stream().reduce(0, (e1, e2) -> e1 > e2 ? e1 : e2);

        System.out.println("Maximum = " + max);
    }
}
