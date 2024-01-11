public class Product {
    
    protected String name;
    protected Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String priceTag() {
        StringBuilder pricetag = new StringBuilder();
        pricetag.append(this.name).append(" $ ").append(this.price);
        return pricetag.toString();
    }

}
