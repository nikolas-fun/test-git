package Homework_07;

public class Main2 {
    public static void main(String[] args) {
/*Dog dog = new Dog("Ferz");
dog.nameAnimal();
dog.makeSound();
        System.out.println();
Cat cat = new Cat("Belok");
cat.nameAnimal();
cat.makeSound();
        System.out.println();
        //-------------------------------------*/

        Warrior warrior = new Warrior("Voin Zla", 87, 15);
        Mage mage = new Mage("Koldyn proklatyj", 99, 10);
        Archer archer = new Archer("Mr Strela", 100, 22);

        int attack = warrior.attack();
        System.out.println("Warror  attacks mag " + attack);
        mage.takeDamage(attack);
        mage.printInfo();
    }
}
