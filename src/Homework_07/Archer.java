package Homework_07;

public class Archer  extends Character {
    int agility;
    public Archer(String name, int health, int agility) {
        super(name,health);
this.agility = agility;
    }
  public int  attack(){
    return agility * 2 + 5;
  }

}

