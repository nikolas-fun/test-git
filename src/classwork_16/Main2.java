package classwork_16;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alex", 17, "0754@ukr.net", true, "Kyiv"),
                new User("Anna", 18, "0455@uskr.net", false,"Zhytomyr"),
                new User("Oleh", 97, "04@greykr.net", true,"Odesa"),
                new User("Nikita", 12, "04@ukr.net", false,"Kyiv"),
                new User("Olga", 12, "0@gukr.net", true,"Olevsk"));

        /*Map<String, Double> map = users.stream()
                .collect(Collectors.groupingBy(user -> user.getCity(), Collectors.averagingDouble(user -> user.getAge())));

        for (Map.Entry<String,Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/
        //задание1
        System.out.println("-----задание1");

        List<User> result1 = allFirstThenSecond(users);
        System.out.println(result1);
        //задание2
        System.out.println("-----задание2");
        List<User> result2 = sorted(users);
        System.out.println(result2);
        System.out.println();
        Map<Integer, List<User>> res2 = users.stream()
                .collect(Collectors.groupingBy(User::getAge));
       for (Map.Entry<Integer, List<User>> entry : res2.entrySet()) {
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
        //задание3
       System.out.println();
       System.out.println("-----задание3");
        System.out.println(allName(users));
        //задание4
        System.out.println();
        System.out.println("-----задание4");
        System.out.println(allNameUsersActive(users));

    }
    public static void firstThenSecond (List<User> users) {
        users.sort(Comparator.comparing(User::isActive).reversed());
    }
    public static List<User> allFirstThenSecond(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::isActive).reversed())
                .toList();
    }
    
    public static List<User> sorted(List<User> users) {
       return  users.stream().sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());

    }

    public static String allName(List<User> users) {
        return users.stream()
                .map(User::getName)
        .collect(Collectors.joining(", "));
    }

    public static String allNameUsersActive(List<User> users) {
        return users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .collect(Collectors.joining(" | "));

    }


}
