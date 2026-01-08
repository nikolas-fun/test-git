package homework_16;

public class Bank {


    public TransferResult transfer(BankAccount from, BankAccount to, double amount) {
        if (from.balance >= amount) {
            from.balance -= amount;
            to.balance += amount;
            return new TransferResult("перевод успешный", true, from.balance);
        } else return new TransferResult("перевод не успешный", false, from.balance);
    }
}
