import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>(); 

        System.out.print("Enter the number of products: ");
        int numberProducts = sc.nextInt();

        for(int i=1; i <= numberProducts; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String type = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            
            switch (type.toLowerCase()) {
                case "i":
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
                
                case "u":
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    products.add(new UsedProduct(name, price, date));
                    break;
                case "c":
                    products.add(new Product(name, price));
                    break;
                default:
                    System.out.println("There is no such option");
                    break;
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product prod : products) {
			System.out.println(prod.priceTag());
		}

        sc.close();

}
    
}

