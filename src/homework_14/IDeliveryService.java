package homework_14;

public interface IDeliveryService {


    double calculateDeliveryCost(String city, int amount);
    void deliverOrder(Items item, String city, int amount);

}
