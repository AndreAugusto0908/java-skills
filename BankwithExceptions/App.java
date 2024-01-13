import java.util.Scanner;
import java.util.InputMismatchException;
import exceptions.*;

public class App {

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {

        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Holder: ");
            String name = sc.nextLine();
            System.out.print("Number account: ");
            int number = sc.nextInt();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            System.out.print("Initial balance: $");
            double balance = sc.nextDouble();
            Account acc = new Account(number, name, balance, withdrawLimit);
            System.out.print("Deposit an amount: ");
            double amount = sc.nextDouble();
            acc.deposit(amount);
            System.out.print("Withdraw an amount: ");
            double withdrawAmount = sc.nextDouble();
            acc.withdraw(withdrawAmount);

            System.out.println(acc);

        } catch (AccountException e) {

            System.out.println(e.getMessage());

        }catch(InputMismatchException e){

            System.out.println("Invalid Entered Value");

        }catch(RuntimeException e){
            System.out.println("Unexpected error ");
        } finally {

            sc.close();
        }
    }
}