import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicador = 1;
        int dividendo = sc.nextInt();
        int divisor = sc.nextInt();
        if(divisor == 0){
            System.out.println(0);
        }else{
        System.out.println(resto(dividendo, divisor, multiplicador));
        }
        sc.close();

    }

    public static int resto(int dividendo, int divisor, int multiplicador){
        if (dividendo < divisor * multiplicador){
            return dividendo - divisor * (multiplicador - 1);
        } else{
            return resto(dividendo, divisor, multiplicador + 1);
        }
    }
}
