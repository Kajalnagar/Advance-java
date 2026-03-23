// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.List;

public class reduce11 {
   public reduce11() {
   }

   public static void main(String[] var0) {
      List var1 = List.of("Pea", "Apple", "Mango", "banana");
      String var2 = (String)var1.stream().reduce("", (var0x, var1x) -> var0x.length() > var1x.length() ? var0x : var1x);
      System.out.println(var2);
   }
}
