import java.util.Scanner;

public class DivisaoSubtracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo = sc.nextInt();
        int divisor = sc.nextInt();
        if (divisor < 1) {
            System.out.println(0);
        }else{
            System.out.println(divisor(dividendo, divisor));
        }
        
        sc.close();

    }

    public static int divisor(int dividendo, int divisor){

        if(divisor < dividendo){
            return 0;
        }else{
            return divisor / dividendo + divisor(dividendo -divisor, dividendo);
        }

    }
}

/* Verde deu erro nesse
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dividendo = sc.nextInt();
    int divisor = sc.nextInt();
    if (divisor < 1) {
        System.out.println(0);
    }else{
        System.out.println(divisor(dividendo, divisor));
    }
    
    sc.close();

}

public static int divisor(int dividendo, int divisor){

    if(divisor >= dividendo){
        return 1;
    }else{
        return divisor(dividendo - divisor, divisor) + 1;
    }

}

*/