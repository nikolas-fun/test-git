package classwork_16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Alex", 17, "0754@ukr.net", true),
                new User("Anna", 18, "0455@uskr.net", false),
                new User("Oleh", 97, "04@greykr.net", true),
                new User("Nikita", 107, "04@ukr.net", false),
                new User("Olga", 12, "0@gukr.net", true));


        List<User> result = getAllActiveUsers(users);

        System.out.println(result);

        System.out.println(getAllActiveUsers(users));
    }

    public static List<User> getAllActiveUsers(List<User> users) {
        return users.stream()
                .filter(u -> u.isActive())
                .toList();

    }

}
