import java.util.*;
import java.util.stream.*;

public class reduce8 {
    // concatenate all strings whose length is greater than 3
    public static void main(String[] args) {
        List<String> li = List.of("Pea", "Apple", "Mango", "banana");

        String concen = li.stream()
                          .filter(n -> n.length() > 3)
                          .reduce((e1, e2) -> e1 + e2)
                        .orElse("");   // handle Optional

        System.out.println(concen);
    }
}
