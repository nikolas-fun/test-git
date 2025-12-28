package homework_14;

public class StandardDelivery implements IDeliveryService {
    private double basePrice = 15;
    @Override
    public double calculateDeliveryCost(String city, int amount) {
        double coefficient;
        if (city.equalsIgnoreCase("London")) {
            coefficient = 2.5;
        }else {
            coefficient = 4.0;
    }
        return basePrice * amount * coefficient;}

    @Override
    public void deliverOrder(Items item, String city, int amount) {
if ( item.getCount() < amount) {
    System.out.println("товара нет");
}
item.setCount(item.getCount() - amount);
        double price = calculateDeliveryCost(city, amount);

        System.out.println("Тип доставки: StandardDelivery");
        System.out.println("Город: " + city);
        System.out.println("Товар: " + item.getName());
        System.out.println("Количество: " + amount);
        System.out.println("Цена доставки: " + price);
    }
}

