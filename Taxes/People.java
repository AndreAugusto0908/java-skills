public abstract class People {

    protected String name;
    protected double annualIncome;

    public People(String name, double annualIncome){
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract double taxation();
}