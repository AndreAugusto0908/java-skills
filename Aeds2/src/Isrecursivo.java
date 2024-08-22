import java.util.Scanner;

public class Isrecursivo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();

        while (!palavra.equals("FIM")) {
            char[] letras = palavra.toCharArray();
            String vogais = vogais(palavra) ? "SIM" : "NAO";
            String consoantes = consoantes(palavra) ? "SIM" : "NAO";
            String inteiro = inteiro(palavra, 0) ? "SIM" : "NAO";
            String real = real(palavra) ? "SIM" : "NAO";

            System.out.println(vogais + " " + consoantes + " " + inteiro + " " + real);

            palavra = sc.nextLine();
        }
        sc.close();

    }

    public static boolean vogais(String str) {
        if (str.isEmpty()) {
            return true;
        }
        
        char firstChar = str.charAt(0);
        
        if (!isVowel(firstChar)) {
            return false;
        }
        
        return vogais(str.substring(1));
    }


    public static boolean consoantes(String str) {
        if (str.isEmpty()) {
            return true;
        }
        
        char firstChar = str.charAt(0);

        if (isVowel(firstChar) || Character.isDigit(firstChar)) {
            return false; // Se for uma vogal, retorna falso
        }

        return consoantes(str.substring(1));
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static boolean inteiro(String str, int index) {
        if (index == str.length()) {
            return true;
        }

        char c = str.charAt(index);
        if (!Character.isDigit(c)) {
            return false; 
        }
        return inteiro(str, index + 1);
    }

    public static boolean real(String s) {
        return isRealNumberHelper(s, 0, false);
    }

    private static boolean isRealNumberHelper(String s, int index, boolean foundDecimal) {
        if (index >= s.length()) {
            return true;
        }
        char c = s.charAt(index);
        if (c >= '0' && c <= '9') {
            // Se o caractere atual é um dígito, avança para o próximo caractere
            return isRealNumberHelper(s, index + 1, foundDecimal);
        } else if ((c == '.' || c == ',') && !foundDecimal) {
            // Se o caractere atual é uma vírgula ou um ponto e ainda não encontramos nenhum ponto anteriormente
            return isRealNumberHelper(s, index + 1, true);
        } else {
            // Se o caractere não é um dígito e não é o ponto ou a vírgula, não é um número real
            return false;
        }
    }

}
