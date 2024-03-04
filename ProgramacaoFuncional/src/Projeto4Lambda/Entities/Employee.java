package Projeto4Lambda.Entities;

public class Employee {
    
    private String name;
    private String email;
    private Double salary;

    public Employee(String name, String email, Double salary){
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public Double getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Email: " + email + " Salary: " + salary;
    }


}
