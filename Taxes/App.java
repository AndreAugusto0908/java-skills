import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<People> peoples = new ArrayList<>();

        System.out.print("How many contributors will be added? ");
        int contributors = sc.nextInt();

        for (int i = 1; i <= contributors; i++){
            System.out.println("Contributor #" + i);
            System.out.print("Type of contributor (Individual / Corporate)(i/c): ");
            String type = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if(type.equals("i")){
                System.out.print("How much was the health expenditure? ");
                double healthExpenditure = sc.nextDouble();
                peoples.add(new NaturalPerson(name, annualIncome, healthExpenditure));
            }

            if(type.equals("c")){
                System.out.print("How many employees does the company have? ");
                int numberEmployees = sc.nextInt();
                peoples.add(new LegalEntity(name, annualIncome, numberEmployees));
            }
        }

        System.out.println("=============================================================== ");

        for(People tp : peoples){
            System.out.println(tp) ;
        }

        sc.close();
    
    }

    
}

