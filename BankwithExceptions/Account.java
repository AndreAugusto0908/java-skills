import exceptions.AccountException;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit; 
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws AccountException{
        if (amount > withdrawLimit){
            throw new AccountException("The withdraw amount is greater than the account limit.");
        }
        if (amount > balance){
            throw new AccountException("You don't have this amount to withdraw.");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Name: ").append(holder)
                .append("| Number account: ").append(number)
                .append("| Balance: $").append(balance);
        return relatorio.toString();
    }

}