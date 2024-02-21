public class LegalEntity extends People {

    private int numberEmployees;

    /**
     * Constructor for creating a LegalEntity object.
     * 
     * @param name           The name of the legal entity.
     * @param annualIncome   The annual income of the legal entity.
     * @param numberEmployees   The number of employees of the legal entity.
     */
    public LegalEntity(String name, double annualIncome, int numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    /**
     * Calculates the taxation amount for the legal entity based on its annual income and number of employees.
     * 
     * @return The calculated taxation amount.
     */
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

    /**
     * Provides a string representation of the LegalEntity object.
     * 
     * @return A string representation of the LegalEntity object.
     */
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
