package Homework_07;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("Woof!");
    }
    public void nameAnimal(){
        System.out.println(name);
    }
}
