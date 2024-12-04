package module3.task8;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        setBalance(getBalance()+getBalance()*0.05);
        return getBalance();
    }
}
