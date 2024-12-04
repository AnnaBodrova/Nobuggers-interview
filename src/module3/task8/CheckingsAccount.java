package module3.task8;

public class CheckingsAccount extends BankAccount{
    public CheckingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance();
    }
}
