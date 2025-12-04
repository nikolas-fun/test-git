package Homework_07;

public class Mage extends Character {
    int mana;
    public Mage(String name,int health, int mana) {
        super(name,health);
        this.mana = mana;
    }

    @Override
    public int  attack(){
        return mana * 3;
    }

    public void action(){
        System.out.println("Warrior in action");
    }
}

