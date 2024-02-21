package MostExpensiveProduct.Entities;

public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

    public String toString(){
        return name + ": R$= " + String.format("%.2f", price); 
    }

    @Override
    public int compareTo(Product o) {
        return price.compareTo(o.getPrice());
    }
    
}
