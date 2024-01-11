public class ImportedProduct extends Product {
    
    private double customsFee;

    public ImportedProduct(String name, Double price, double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        double totalPrice = price + customsFee;
        return totalPrice;
    }

    @Override
    public String priceTag() {
        StringBuilder pricetag = new StringBuilder();
        pricetag.append(this.name).append(" $ ").append(totalPrice()).append(" Customs fee: $ ").append(this.customsFee);
        return pricetag.toString();
    }
}
