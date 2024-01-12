public class NaturalPerson extends People{

    private double healthExpenditure;

    public NaturalPerson(String name, double annualIncome, double healthExpenditure){
        super(name, annualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public double taxation(){
        double taxation = 0;
        if(annualIncome < 20000 && annualIncome > 0){
            taxation = annualIncome * 0.15;
        }else{
            taxation = annualIncome * 0.25;
        }

        if(healthExpenditure > 0){
            taxation = taxation * 0.5;
        }

        return taxation;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(this.name)
                .append("| Annual Income: ").append(this.annualIncome)
                .append(" | Taxation: ").append(taxation());
        return builder.toString();
    }

    
}
