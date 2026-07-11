package homework_21;

import static_22.Car;

public class Main {


    public static void main(String[] args) {


        Car car = new Car.Builder()
                .model("BMW")
                .year(1995)
                .build();


        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
