package bank;

import bank.model.Account;
import bank.model.CreditAccount;
import bank.model.SavingsAccount;

public class MainTask4 {
    public static void main(String[] args) {
        Account acc1 = new Account("1001", "Ержан", 100000);
        SavingsAccount acc2 = new SavingsAccount("1002", "Динара", 50000, 0.05);
        CreditAccount acc3 = new CreditAccount("1003", "Марат", 0, 20000);

        System.out.println("=== Исходные счета ===");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);

        System.out.println();
        System.out.println("=== Перевод ===");
        acc1.transfer(acc2, 20000);
        System.out.println(acc1);
        System.out.println(acc2);

        System.out.println();
        System.out.println("=== Начисление процентов на сберегательный счёт ===");
        acc2.addInterest();
        System.out.println(acc2);

        System.out.println();
        System.out.println("=== Снятие с кредитного счёта (уход в минус в пределах лимита) ===");
        acc3.withdraw(15000);
        System.out.println(acc3);

        System.out.println();
        System.out.println("=== Копирование и equals() ===");
        Account acc1Copy = acc1.copyAccount();
        System.out.println("Копия acc1: " + acc1Copy);
        System.out.println("acc1 == acc1Copy (ссылки): " + (acc1 == acc1Copy));
        System.out.println("acc1.equals(acc1Copy) (по номеру счёта): " + acc1.equals(acc1Copy));
    }
}
