package bank.model;

public interface Transferable {
    void transfer(Account target, double amount);
}
