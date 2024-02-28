package Projeto2Lambda.Service;

import java.util.List;
import java.util.function.Predicate;

import Projeto2Lambda.Entities.Product;

public class ProductService {
    
    public int filteredList (List<Product> list, Predicate<Product> parameter){

        int sum = 0;

        for (Product p : list){
            if(parameter.test(p)){
                sum += p.getValor();
            }
        }
        return sum;

    }

}
