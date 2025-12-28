package homework_14;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WarehouseService warehouseService = new WarehouseService();
        boolean startMenu = true;

        while (startMenu) {
            System.out.println("\n=== WAREHOUSE CONTROL SYSTEM ===");
            System.out.println("1. Add Food Product");
            System.out.println("2. Add Electronics Product");
            System.out.println("3. Add Clothing Product");
            System.out.println("4. Show all products");
            System.out.println("5. Restock product");
            System.out.println("6. Deliver product (Standard)");
            System.out.println("7. Deliver product (Express)");
            System.out.println("8. Show total warehouse value");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Please enter the product name: ");
                    String name = sc.next();
                    System.out.println("Please enter the product price: ");
                    double price = sc.nextDouble();
                    System.out.println("Please enter the product count: ");
                    int count = sc.nextInt();
                    System.out.println("Please enter the product date: ");
                    String expirationDate = sc.next();

                    Items food = new FoodProduct(expirationDate, name, price, count, ETypeItem.FOOD);

                    warehouseService.addItems(food);
                    System.out.println("Warehouse has been added");

                }
                case 2 -> {
                    System.out.println("Please enter the product name: ");
                    String name = sc.next();
                    System.out.println("Please enter the product price: ");
                    double price = sc.nextDouble();
                    System.out.println("Please enter the product count: ");
                    int count = sc.nextInt();
                    System.out.println("Please enter the product warranty: ");
                    int warrantyMonths = sc.nextInt();

                    Items electronic = new Electronic(warrantyMonths, name, price, count, ETypeItem.ELECTRONICS);

                    warehouseService.addItems(electronic);
                    System.out.println("Warehouse has been added");
                }
                case 3 -> {
                    System.out.println("Please enter the product name: ");
                    String name = sc.next();
                    System.out.println("Please enter the product price: ");
                    double price = sc.nextDouble();
                    System.out.println("Please enter the product count: ");
                    int count = sc.nextInt();
                    System.out.println("Please enter the product size: ");
                    String size = sc.next();

                    Items clothing = new Clothing(size, name, price, count, ETypeItem.CLOTHING, EGenderCloth.MALE);

                    warehouseService.addItems(clothing);
                    System.out.println("Warehouse has been added");

                }
                case 4 -> {
                    warehouseService.allItems();
                }
                case 5 ->{
                    warehouseService.allItems();
                    System.out.println("Please enter the product ID: ");
                    int id = sc.nextInt();
                    System.out.println("Please enter the product count: ");
                    int count = sc.nextInt();
                    warehouseService.restockProduct(id, count);
                    System.out.println("Warehouse has been edit");
                }
                case 6 -> {
                    warehouseService.allItems();
                    System.out.println("Please enter the product ID: ");
                    int id = sc.nextInt();
                    System.out.println("Please enter the product amount: ");
                    int amount = sc.nextInt();
                    System.out.println("Please enter the city: ");
                    String city = sc.next();

                    warehouseService.deliverProduct(id, amount, city);

                }
                case 0 -> {
                    return;
                }

            }
        }
    }
}

