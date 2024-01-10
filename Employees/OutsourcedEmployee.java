public class OutsourcedEmployee extends Employee {
    
    private double additionalCharge;

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        double bonus = additionalCharge * 1.1;
        return super.payment() + bonus;
    }

}