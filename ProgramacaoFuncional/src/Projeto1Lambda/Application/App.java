package Projeto1Lambda.Application;

import java.util.ArrayList;
import java.util.List;

import Projeto1Lambda.Entities.Product;

public class App {
    public static void main(String[] args) {
        
        List<Product> lista = new ArrayList<>();

        lista.add(new Product("TV", 500));
        lista.add(new Product("Casa", 11500));
        lista.add(new Product("Dado", 5));
        lista.add(new Product("Mouse", 99));

        lista.removeIf(p -> p.ehMaior());

        for (Product p : lista){
            System.out.println(p);
        }



    }
}
