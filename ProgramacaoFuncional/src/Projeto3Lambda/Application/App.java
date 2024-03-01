package Projeto3Lambda.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Projeto3Lambda.Entities.Product;

public class App {
    public static void main(String[] args) {
        
        String path = "D:\\André\\Programação modular\\java-skills\\ProgramacaoFuncional\\src\\Projeto3Lambda\\Application\\products.txt";
        List<Product> list = new ArrayList<>();

        try(BufferedReader b = new BufferedReader(new FileReader(path))){

            String produtoInt = b.readLine();

            while (produtoInt != null) {
                
                String[] partes = produtoInt.split(",");
                list.add(new Product(partes[0], Double.parseDouble(partes[1])));
                produtoInt = b.readLine();

            }

            Double media = list.stream()
            .mapToDouble(Product::getValor)
            .average()
            .orElse(0);

            System.out.println("Média: " + media);
            

            List<Product> list2 = list.stream()
            .filter(x -> x.getValor() < media)
            .collect(Collectors.toList());

            list2.sort(Comparator.comparing(Product::getNome).reversed());

            System.out.println("Produtos com valor menor que a média: ");

            for (Product p : list2){
                System.out.println();
                System.out.println(p);
            }
    
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
