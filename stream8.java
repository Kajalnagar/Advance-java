// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream8 {
   public stream8() {
   }

   public static void main(String[] var0) {
      List var1 = Arrays.asList(45, 36, 8, 99, 97);
      List var2 = (List)var1.stream().filter((var0x) -> var0x % 3 == 0).collect(Collectors.toList());
      System.out.println(var2);
   }
}
