package Projeto2Lambda.Application;

import java.util.ArrayList;
import java.util.List;

import Projeto2Lambda.Entities.Product;
import Projeto2Lambda.Service.ProductService;

public class App {
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1000));
        list.add(new Product("Carro", 3000));
        list.add(new Product("Dado", 10));
        list.add(new Product("Tablet", 1500));

        ProductService pService = new ProductService();


        System.out.println(pService.filteredList(list, p -> p.getNome().charAt(0) == 'T'));

    }
}
