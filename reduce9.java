import java.util.*;

public class reduce9 {
    public static void main(String[] args) {
        List<Integer> li = List.of(1, 2, 3, 4, 5);

        int product = li.stream().filter(n -> n % 2 != 0).reduce(1, (a, b) -> a * b);

        System.out.println("Product of odd numbers = " + product);
    }
}
// multiply only odd num by reduce()
