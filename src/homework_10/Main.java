package homework_10;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Excalibur", 20, 8);
        Blacksmith blacksmith = new Blacksmith("Gendalf", 0, 0);

        System.out.println("До улучшения: " + sword);

        blacksmith.upgradeWeapon(sword);

        System.out.println("После улучшения: " + sword);


        Bank bank = new Bank();
        BankAccount  from = new BankAccount();
        BankAccount to = new BankAccount();
        from.setBalance(1000);
        System.out.println(from.getBalance());
        bank.transfer(from, to, 400);
        System.out.println(from.getBalance() + " " + to.getBalance());

    }
}
