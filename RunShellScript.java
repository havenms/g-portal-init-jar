import java.io.IOException;

public class RunShellScript {
   public static void main(String[] var0) {
      try {
         String var1 = "start.sh";
         String[] var2 = new String[]{"/bin/sh", var1};
         Process var3 = Runtime.getRuntime().exec(var2);
         var3.waitFor();
         System.out.println("Shell script executed successfully.");
      } catch (InterruptedException | IOException var4) {
         var4.printStackTrace();
      }

   }
}
