package bank.model;

import java.util.Objects;

public class Account implements Transferable {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;

    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма пополнения должна быть положительной");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма снятия должна быть положительной");
        }
        if (amount > balance) {
            throw new IllegalStateException("Недостаточно средств на счёте " + accountNumber);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public void transfer(Account target, double amount) {
        this.withdraw(amount);
        target.deposit(amount);
        System.out.println("Перевод " + amount + " тг со счёта " + accountNumber + " на счёт " + target.accountNumber + " выполнен.");
    }

    // Создаёт копию счёта (новый объект с теми же данными)
    public Account copyAccount() {
        return new Account(this.accountNumber, this.ownerName, this.balance);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        // Два счёта считаем равными, если совпадает номер счёта
        return Objects.equals(accountNumber, other.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{№" + accountNumber + ", владелец='" + ownerName + "', баланс=" + balance + "}";
    }
}
