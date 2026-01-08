package homework_16;

public class Main {
    public  static void main(String[] args) {

BankAccount account1 = new BankAccount("Oleg", 850);
BankAccount account2 = new BankAccount("Ira", 100);
/*account1.transfer(account2, account1, 500 ){
    if(TransferResult.success == true);
    System.out.println("выведи новый баланс");
        }
        /*В main:
        создай два аккаунта
        вызови transfer
        используй возвращённый объект:
        выведи сообщение
        если success == true, выведи новый баланс*/
        Bank bank = new Bank();
        TransferResult result = bank.transfer(account2, account1, 500);// new TransferResult("перевод успешный", true, from.balance);
        if (result.success) {
            System.out.println("Новый баланс отправителя: " + result.remainingBalance);
            System.out.println("Баланс получателя: " + account2.balance);
        }

    }
}