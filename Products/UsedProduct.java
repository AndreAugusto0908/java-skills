import java.time.LocalDate;

public class UsedProduct extends Product {

    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder pricetag = new StringBuilder();
        pricetag.append(this.name).append(" (Used) $ ").append(this.price).append(" (Manufacture date: ").append(manufactureDate.toString()).append(")");
        return pricetag.toString();
    }

    
}