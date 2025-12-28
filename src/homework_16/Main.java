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

        TransferResult result = account1.transfer(account2, account1, 500);
        System.out.println(result.message);
        if (result.success) {
            System.out.println("Новый баланс отправителя: " + result.remainingBalance);
        }
    }
}