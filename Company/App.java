import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String nameDepartament = teclado.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String nameWorker = teclado.nextLine();
        System.out.print("Level: ");
        String levelWorker = teclado.nextLine();
        System.out.print("Base salary: ");
        Double baseSalary = teclado.nextDouble();

        Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(levelWorker), baseSalary, new Departament(nameDepartament));

        System.out.println("How many contracts to this worker?");
        int n = teclado.nextInt();

        try {
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(teclado.next());
            System.out.print("Value per hour: ");
            Double contractHour = teclado.nextDouble();
            System.out.print("Duration (hours): ");
            Integer contractDuration = teclado.nextInt();
            Contracts contract = new Contracts(contractDate, contractHour, contractDuration);
            worker.addContract(contract);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use DD/MM/YYYY.");
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = teclado.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3, 7));

        System.out.println(worker);
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        teclado.close();
    }
}
