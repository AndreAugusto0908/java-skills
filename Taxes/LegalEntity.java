public class LegalEntity extends People {

    private int numberEmployees;

    public LegalEntity(String name, double annualIncome, int numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double taxation() {
        double taxation = 0;
        if (numberEmployees <= 10 && numberEmployees > 0) {
            taxation = annualIncome * 0.16;
        } else {
            taxation = annualIncome * 0.14;
        }
        return taxation;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(this.name)
                .append("| Annual Income: ").append(this.annualIncome)
                .append("| Number employees: ").append(this.numberEmployees)
                .append(" | Taxation: ").append(taxation());
        return builder.toString();
    }

}
