// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream6 {
   public stream6() {
   }

   public static void main(String[] var0) {
      List var1 = Arrays.asList("rama", "shyam", "kam");
      List var2 = (List)var1.stream().map((var0x) -> var0x.toUpperCase()).collect(Collectors.toList());
      System.out.println(var2);
   }
}
