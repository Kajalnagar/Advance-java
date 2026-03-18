// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream4 {
   public stream4() {
   }

   public static void main(String[] var0) {
      List var1 = Arrays.asList(10, 60, 30, 80, 20);
      List var2 = (List)var1.stream().filter((var0x) -> var0x > 50).collect(Collectors.toList());
      System.out.println(var2);
   }
}
