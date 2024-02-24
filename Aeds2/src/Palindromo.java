import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        while (!palavra.equals("#")) {
            System.out.println(palindromo(palavra, 0));
            palavra = sc.nextLine();
        }
        sc.close();
    }

    public static String palindromo(String palavra, int number){
        char[] letras = palavra.toCharArray();
        if ((letras[number] == letras[letras.length - 1 - number]) && (number <= letras.length / 2)) {
            return palindromo(palavra, number + 1);
        }else if (letras[number] == letras[letras.length - 1 - number]) {
            return "SIM";
        }else{
            return "NAO";
        }
}
}
