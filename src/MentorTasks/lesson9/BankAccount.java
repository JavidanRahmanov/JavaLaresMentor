package MentorTasks.lesson9;

import java.math.BigInteger;

public class BankAccount {
    BigInteger accountNumber = new BigInteger("4169738852423472");
    double balance = 200;

    double deposit(double amount) {
        System.out.println(amount + " Added");
        return balance += amount;
    }

    double cashDraw(double amount) {
        if (amount > balance) {
            System.out.println("There is not enough money in the balance");
            return balance;
        }
        System.out.println(amount + " CashDraw");
        return this.balance -= amount;
    }
}

