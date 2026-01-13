package homework_18;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("stream", "java", "collection", "api", "filter");

       int result = list.stream().mapToInt(String::length).sum();// element ---> primitive
       /* list.stream().map(word -> word.length()).sum();// element ---> Object ----> Integer*/

      /*Optional <String> result =  list.stream().
                filter(x -> x.length() > 5)
                .findFirst().map(String::length);*/

        System.out.println(result);

        HashSet<String> email = new HashSet<>();
        email.add("test@gmail.com");
        email.add("admin@yahoo.com");
        email.add("user@mail.com");
      // email.stream().filter(x -> x.contains("@")).filter(x -> x.contains("@gmail.com")).forEach(System.out::println);

        boolean result2 = email.stream().allMatch(x -> x.contains("@"));
        System.out.println(result2);

        boolean result3 = email.stream().anyMatch(x -> x.contains("@gmail.com"));
        System.out.println(result3);




    }
}
