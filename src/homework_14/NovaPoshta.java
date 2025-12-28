package homework_14;

public class NovaPoshta implements IDeliveryService {

    ;

    @Override
    public double calculateDeliveryCost(String city, int amount) {
        double coefficient;
        double basePrice = 100;
        if (city.equalsIgnoreCase("Kyiv")) {
            coefficient = 1.2;
        }
        else if (city.equalsIgnoreCase("Odesa")) {
            coefficient = 1.5;
        }
        else {
            coefficient = 1.0;
        }

        return basePrice * amount * coefficient;
    }

    @Override
    public void deliverOrder(Items item, String city, int amount) {
        if (item.getCount() < amount) {
            System.out.println("Товар отсутствует");
            return;
        }
            item.setCount(item.getCount() - amount);

            double price = calculateDeliveryCost(city, amount);

            System.out.println("Тип доставки: Nova Poshta");
            System.out.println("Город: " + city);
            System.out.println("Товар: " + item.getName());
            System.out.println("Количество: " + amount);
            System.out.println("Цена доставки: " + price);

    }
}
