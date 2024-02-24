import java.util.Scanner;

public class ContarDigitos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int digitos = contarDigitos(numero);
        System.out.println(digitos);
        sc.close();
    }

    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        }
        return 1 + contarDigitos(numero / 10);
    }
}

/*   O verde está dando erro nesse código 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt(); 
        int numeroSeparado = separaNumero(numero, 10, 1);
        System.out.println(numeroSeparado);
        sc.close();

    }

    public static int separaNumero(int x, int n, int i){
        if(x / n < 1){
            return i;
        }else{
            return separaNumero(x, n * 10, i+1);
        }
    }
}

*/

