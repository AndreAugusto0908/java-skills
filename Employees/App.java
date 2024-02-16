import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberEmployee = sc.nextInt();
        int cont = 0;

        for(int i = 0; i < numberEmployee; i++){
            cont++;
            System.out.println("Employee #" + cont);
            System.out.print("Outsourced (y/n)?");
            sc.nextLine();
            String outsourced = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if(outsourced.toLowerCase().equals("y")){
                System.out.print("Additional charge: ");
                Double additional = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additional);
                employees.add(employee);
            }else{
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
            
        }
        System.out.println("========================================================================");
        
        for (int i = 0; i < employees.size(); i++){
            System.out.println("Payment: " + employees.get(i).toString());
        }
        
        sc.close();

    }
    
}
