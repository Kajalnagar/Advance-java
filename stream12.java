// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.List;

public class stream13skip {
   public stream13skip() {
   }

   public static void main(String[] var0) {
      List var1 = List.of(10, 30, 40, 45, 56, 10, 6, 89);
      List var2 = var1.stream().distinct().skip(3L).toList();
      System.out.println(var2);
   }
}
