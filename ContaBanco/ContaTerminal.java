import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite a Agência !");
        String agencia = sc.next();

        System.out.println("Por favor, digite o nome do titular!");
        String nomeTitular = sc.next();

        sc.nextLine();

        System.out.println("Por favor, digite o saldo!");
        double saldo = sc.nextDouble();
        ContaCliente cliente = new ContaCliente(numero, agencia, nomeTitular, saldo);

        System.out.println(cliente);
    }

}
