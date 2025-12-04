package Homework_08.Classwork_08;

public class Main {

        public static void main(String[] args) {
            IMove car = new Car();
            car.move();
            car.printInfo();

            Car car2 = new Car();
            car2.printInfo();
        }
    }

