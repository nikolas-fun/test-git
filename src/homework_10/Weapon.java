package homework_10;

public class Weapon {
  private   String name;
  private   int damage;
  private   int level;
    //конструктор, геттеры/сеттеры, toString
    public Weapon(String name, int damage, int level) {
        this.name = name;
        this.damage = damage;
        this.level = level;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", level=" + level +
                '}';
    }
}
