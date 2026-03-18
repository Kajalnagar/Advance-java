// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream5 {
   public stream5() {
   }

   public static void main(String[] var0) {
      List var1 = Arrays.asList("Ananya", "Rama", "Avantika", "Annu");
      List var2 = (List)var1.stream().filter((var0x) -> var0x.startsWith("A")).collect(Collectors.toList());
      System.out.println(var2);
   }
}
