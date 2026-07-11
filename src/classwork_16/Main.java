package classwork_16;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


/*
        List<User> users = List.of(
                new User
                        ("Alex", 17, "0754@ukr.net", true),
                new User("Anna", 18, "0455@uskr.net", false),
                new User("Oleh", 97, "04@greykr.net", true),
                new User("Nikita", 107, "04@ukr.net", false),
                new User("Olga", 12, "0@gukr.net", true));


        for (User user1 : users) {
            System.out.println(user1.toString());
        }


        List<User> result = getAllActiveUsers(users);
        List<String> result1 = getAgeEmail(users);
        List<String> result2 = getAllUsersName(users);
        List<String> result3 = getAllNameUsersActive(users);
        Optional<User> result4 = getOneSmallUsers(users);
        List<User> result5 = LimitUsers(users);

//        System.out.println(result);
        System.out.println(result1);
        System.out.println("---");
        System.out.println(result2);
        System.out.println("---");
        System.out.println(result3);
        System.out.println("---");
        System.out.println(result4);
        System.out.println("---");
        System.out.println(result5);*/
        //       getAllNameUsersActive(users).forEach((e,s)->System.out.println(e + " " + s));
        //       System.out.println(getAllActiveUsers(users));
    }

    public static List<User> getAllActiveUsers(List<User> users) {
        return users.stream()
                .filter(u -> u.isActive())
                .toList();

    }

    public static List<String> getAgeEmail(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getEmail)

                .collect(Collectors.toList());
    }

    public static List<String> getAllUsersName(List<User> users) {
        return users.stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
    }

    public static List<String> getAllNameUsersActive(List<User> users) {
        return users.stream()
                .filter(u -> u.isActive())
                .map(u -> u.getName())
                .collect(Collectors.toList());

    }

    public static Optional<User> getOneSmallUsers(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() < 18)
                .findFirst();
    }

    public static List<User> LimitUsers(List<User> users) {
        return users.stream()
                .skip(2)
                .collect(Collectors.toList());
    }
}
