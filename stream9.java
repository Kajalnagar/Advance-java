// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream9 {
   public stream9() {
   }

   public static void main(String[] var0) {
      List var1 = Arrays.asList(45, 19, 25, 18, 14);
      List var2 = (List)var1.stream().filter((var0x) -> var0x <= 20).map((var0x) -> var0x * 3).collect(Collectors.toList());
      System.out.println(var2);
   }
}
