public class Employee {

    private String name;
    private int hours;
    private double valuePerHour;

    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return valuePerHour * hours;
    }

    @Override
    public String toString() {
        double paymentAmount = payment();
        String formattedPayment = String.format("%.2f", paymentAmount);
        String report = "Name: " + this.name + " || Payment: $" + formattedPayment;
        return report;
    }

}
