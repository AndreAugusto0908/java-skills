import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroFibonacci = sc.nextInt();
        System.out.println(serieFibonacci(numeroFibonacci));
        sc.close();
    }

    public static int serieFibonacci(int numeroFibonacci){
        if (numeroFibonacci == 2){
            return 1;
        }else if(numeroFibonacci <= 1){
            return 0;
        }else{
            return serieFibonacci(numeroFibonacci - 1) + serieFibonacci(numeroFibonacci - 2) ;
        }
    }
}