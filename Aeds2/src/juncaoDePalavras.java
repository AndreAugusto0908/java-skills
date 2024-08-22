 import java.util.*;

 public class juncaoDePalavras {
 
   static Scanner entrada = new Scanner(System.in);
 
   private static String alterFrase(String txt, char x, char y) {
     if (txt.length() == 0) {
       return "";
     }
 
     int index = 0;
     char currentCharPosition = txt.charAt(index);
 
     if (currentCharPosition == x) {
       index++;
       return y + alterFrase(txt.substring(1), x, y);
     } else {
       index++;
       return currentCharPosition + alterFrase(txt.substring(1), x, y);
     }
   }
 
   public static void main(String args[]) {
     String txt = "";
     String txtAlterado = "";
     char x, y;
     Random random = new Random();
     random.setSeed(4);
 
     while (!((txt = entrada.nextLine()).equals("FIM"))) {
       x = (char) ('a' + (Math.abs(random.nextInt()) % 26));
       y = (char) ('a' + (Math.abs(random.nextInt()) % 26));
 
       txtAlterado = alterFrase(txt, x, y);
       System.out.println(txtAlterado);
       txtAlterado = "";
     }
     entrada.close();
   }
 }
 