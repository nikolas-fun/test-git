package Homework_07;

public class Character {
    /*2. Игровые персонажи с разными атаками
1. Класс Character (базовый)
    Поля:
    String name
    int health

    Методы:
    int attack() — возвращает 0
    void takeDamage(int dmg) — уменьшает health
    void printInfo() — выводит имя и здоровье

    Создай класс Warrior extends Character
    Доп. поле:
    int strength
    Переопредели attack() так, чтобы он возвращал:
    strength * 2

    Создай класс Mage extends Character
    Доп. поле:
    int mana
    Переопредели attack() так, чтобы он возвращал:
    mana * 3

    Создай класс Archer extends Character
    Доп. поле:
    int agility
    Переопредели attack() так, чтобы он возвращал:
    agility * 2 + 5

    В методе main:
    Создай Warrior, Mage, Archer.
    Пусть воин атакует мага — вычисли урон, выведи его, уменьшай здоровье мага.
    Затем маг атакует лучника — выведи урон, уменьшай здоровье лучника.
    Затем лучник атакует воина — выведи урон, уменьшай здоровье воина.
    После каждой атаки выведи текущее здоровье того, кто получил урон.*/
    String name;
    int health;
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int attack(){
return 0;
    }

    public void takeDamage(int dmg){
        health -= dmg;
    }
   public void printInfo(){
        System.out.println(name+" "+health);
   }

}
