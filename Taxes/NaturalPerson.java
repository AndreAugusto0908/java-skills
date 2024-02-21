/**
 * Represents a natural person, extending the People class.
 */
public class NaturalPerson extends People {

    // Private field to store the health expenditure of the natural person.
    private double healthExpenditure;

    /**
     * Constructor for creating a NaturalPerson object.
     * 
     * @param name              The name of the natural person.
     * @param annualIncome      The annual income of the natural person.
     * @param healthExpenditure The health expenditure of the natural person.
     */
    public NaturalPerson(String name, double annualIncome, double healthExpenditure) {
        super(name, annualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    /**
     * Calculates the taxation amount for the natural person based on their annual income and health expenditure.
     * 
     * @return The calculated taxation amount.
     */
    @Override
    public double taxation() {
        double taxation = 0; 
        
        if (annualIncome < 20000 && annualIncome > 0) {
            taxation = annualIncome * 0.15;
        } else {
            taxation = annualIncome * 0.25;
        }

        if (healthExpenditure > 0) {
            taxation -= (healthExpenditure * 0.5);
        }
        
        if (taxation < 0) {
            taxation = 0;
        }

        return taxation;
    }

    /**
     * Provides a string representation of the NaturalPerson object.
     * 
     * @return A string representation of the NaturalPerson object.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Name: ").append(this.name)
                .append("| Annual Income: ").append(this.annualIncome)
                .append(" | Taxation: ").append(taxation()); 
        
        return builder.toString();
    }
}
