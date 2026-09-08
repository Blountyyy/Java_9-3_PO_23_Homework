package bank.model;

public class SavingsAccount extends Account {
    private double interestRate; // например, 0.05 = 5% годовых

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Начислены проценты на счёт " + accountNumber + ": " + interest + " тг");
    }

    @Override
    public SavingsAccount copyAccount() {
        return new SavingsAccount(accountNumber, ownerName, balance, interestRate);
    }
}
