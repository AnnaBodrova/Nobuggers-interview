package module3.task8;

public abstract class BankAccount {
    private String accountNumber;

    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public abstract double calculateInterest();
    public double deposit(double amount){
        this.balance = this.balance + amount;
        return this.balance;
    }

    public double withdraw(double amount){
        if(this.balance-amount>=0){
            this.balance= this.balance - amount;
        }
        return this.balance;
    }

}
