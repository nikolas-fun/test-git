package homework_10;

public class Bank {
    public boolean transfer(BankAccount from, BankAccount to, double amount){
        if (from.getBalance() < amount){
            return false;
        }else{
            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);
            return true;
        }

    }
}
