package bank.model;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(String accountNumber, String ownerName, double balance, double creditLimit) {
        super(accountNumber, ownerName, balance);
        this.creditLimit = creditLimit;
    }

    // Переопределяем withdraw: можно уходить в минус до creditLimit
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма снятия должна быть положительной");
        }
        if (balance - amount < -creditLimit) {
            throw new IllegalStateException("Превышен кредитный лимит по счёту " + accountNumber);
        }
        balance -= amount;
    }

    @Override
    public CreditAccount copyAccount() {
        return new CreditAccount(accountNumber, ownerName, balance, creditLimit);
    }
}
