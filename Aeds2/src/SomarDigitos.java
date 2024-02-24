import java.util.Scanner;

public class SomarDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int digitosSomados = somarDigitos(numero);
        System.out.println(digitosSomados);
        sc.close();
        
    }

    public static int somarDigitos(int numero){

        if (numero < 10) {
            return numero;
        }else{
            return (numero % 10) + somarDigitos(numero / 10);
        }

    }
}

