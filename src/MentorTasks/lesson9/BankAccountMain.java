package MentorTasks.lesson9;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.cashDraw(1450.5);
        System.out.println("Uptaded balance: " + bankAccount.balance);
    }
}
