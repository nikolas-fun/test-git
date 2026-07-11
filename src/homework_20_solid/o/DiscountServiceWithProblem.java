package homework_20_solid.o;

public class DiscountServiceWithProblem {

    public void discount(String type){

        if(type.equals("NEW")){
            System.out.println("Your discount is 10%");
        }
        else if(type.equals("VIP")){
            System.out.println("Your discount is 40%");

        }
    }
}
