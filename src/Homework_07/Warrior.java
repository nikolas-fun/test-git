package Homework_07;

public class Warrior extends Character {
    int strength;
    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength  = strength;
    }

    public int attack() {
      return  strength * 2;
    }
}

