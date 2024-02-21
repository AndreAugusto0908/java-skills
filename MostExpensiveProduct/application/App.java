package MostExpensiveProduct.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import MostExpensiveProduct.Entities.Product;
import MostExpensiveProduct.Services.CalculationService;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        String path = "D:\\André\\Programação modular\\java-skills\\MostExpensiveProduct\\application\\read.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null) {
                String[] parts = line.split(",");
                list.add(new Product(parts[0], Double.parseDouble(parts[1])));
                line = br.readLine();   
            }
            Product max = CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(max);

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
