package Homework_07;

public class Animal {
   /* 1. Наследование животных
    Создай классы:
    Animal
    Поля: name
    Конструктор с параметрами
    Методы:
    makeSound() — выводит "Some generic sound"

    Создай класс Dog который наследуется от Animal
    Методы:
    переопредели makeSound() так, чтобы выводилось "Woof!"

    Создай класс  Cat который наследуется от Animal
    Методы:
    переопредели makeSound() так, чтобы выводилось "Meow!"
            ✦ Твоя задача:
    В main создать экземпляр классов Cat и Dog, инициализировать их поля через конструктор и вызвать метод makeSound()  у каждого.*/
String name;
public Animal(String name){
    this.name=name;
}
    public void makeSound() {
        System.out.println("Some generic sound");}

}
