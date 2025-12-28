package homework_16;

public class BankAccount {
    String owner;
    double balance;
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    TransferResult transfer(BankAccount from, BankAccount to, double amount){
        if(from.balance >= amount){
            from.balance -= amount;
            to.balance += amount;
            return new TransferResult("перевод успешный", true, from.balance);
        } else return new TransferResult("перевод не успешный", false, from.balance);
    }
}
