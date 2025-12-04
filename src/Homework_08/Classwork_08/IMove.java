package Homework_08.Classwork_08;

public interface IMove {

     void move();

    default void printInfo() {
        System.out.println("Default method");
    }
}
