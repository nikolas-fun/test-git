package homework_20_solid;

import homework_20_solid.o.DiscountServiceWithSolution;
import homework_20_solid.o.NewClient;
import homework_20_solid.o.VIPClient;

public class Main {

    public static void main(String[] args) {
        //SOLID

        // S ---> Single Responsibility  Principle

        NewClient newClient = new NewClient();

        VIPClient vipClient = new VIPClient();


        DiscountServiceWithSolution discountServiceWithSolution = new DiscountServiceWithSolution();
        discountServiceWithSolution.result(vipClient
        );
    }
}
