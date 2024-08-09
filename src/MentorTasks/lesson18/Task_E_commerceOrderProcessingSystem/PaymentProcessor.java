package MentorTasks.lesson18.Task_E_commerceOrderProcessingSystem;

public class PaymentProcessor {

    private double firstBalance;
    private double balance;

    public PaymentProcessor(double firstBalance) {
        this.firstBalance = firstBalance;
        balance = firstBalance;
    }

    public double getBalance() {
        return firstBalance;
    }

    public PaymentProcessor() {
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double pay(double totalAmount) throws PaymentProcessingException {
        if (balance - totalAmount < 0)
            throw new PaymentProcessingException("Not enough balance!");
        return balance -= totalAmount;
    }
}
