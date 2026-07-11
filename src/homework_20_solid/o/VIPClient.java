package homework_20_solid.o;

public class VIPClient implements Discount {
    @Override
    public void apply() {
        System.out.println("Your discount is 40%");
    }
}
