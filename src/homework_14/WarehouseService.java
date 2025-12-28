package homework_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarehouseService {

    private List<Items> listItems = new ArrayList<>();
    private NovaPoshta novaPoshta = new NovaPoshta();

    public void allItems() {
        for (Items item : listItems) {
            System.out.println("ID-->" + " " + item.getId() + "\n" + "Name-->" + " " + item.getName() + "\n" + "Price-->" + item.getPrice());

        }

    }

    //1
    public void addItems(Items item) {
        listItems.add(item);
        System.out.println(item.getName() + " added to warehouse");
    }

    //2
    public void removeProduct(int id) {

    }

    //3
    public Items findById(int id) {
        for (Items item : listItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        throw new ItemNotFoundException("Товар з id " + id + " не знайдено");

        // Items items = new Items("Milk",...);
    }

    //4
    public void deliverProduct(int id, int amount, String city) {
        Items item = findById(id);
        novaPoshta.deliverOrder(item, city, amount);
    }

    //5
    public void restockProduct(int id, int count) {
      Items item = findById(id);// Items items = new Items("Milk",...);
        item.setCount(item.getCount() + count);
    }

    //6
    public List<Items> searchProduct(ETypeItem type) {// FOOD

        List<Items> result = new ArrayList<>();

        for (Items item : listItems) {
            if (item.getType() == type) {// food -- food
                result.add(item);
            }
        }

        if (result.isEmpty()) {
            throw new ItemNotFoundException("Товарів типу " + type + " не знайдено");
        }

        return result;
    }
}

