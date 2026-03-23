import java.util.List;
//replace all negative numbers with 0 and find the sum using reduce 
public class reduce12 {
    public static void main(String[] args) {
        List<Integer> li = List.of(1, 2, 3, 4, 5);
int sum = li.stream().map(a -> a < 0 ? 0 : a).reduce(0, Integer::sum);  // sum all values

        System.out.println(sum);
    }
}
