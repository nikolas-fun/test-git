package homework_19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
     /*   System.out.println("Задание: 1");
        List<String> names = List.of(
                "Bob", "Alex", "Charlie", "David", "Eve", "Frank");

        names.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);


        System.out.println();
        System.out.println("Задание: 2");


        List<String> messages = List.of(
                "System: chat created",
                "System: user joined",
                "Hi!",
                "Hello!",
                "How are you?"
        );
        messages.stream()
                .skip(2)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Задание: 3");

        List<String> products = List.of(
                "Laptop", "Phone", "Tablet",
                "Monitor", "Keyboard", "Mouse",
                "Printer"
        );
        products.stream()
                .skip(3)
                .limit(3)
                .forEach(System.out::println);

        System.out.println();*/
        System.out.println("Задание: 4");



        List<String> words = List.of("java", "spring", "stream");



    List <String> result =  words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(result);
        /*System.out.println();
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

        List<String> result = list.stream()
                .filter( s -> Character.isUpperCase(s.charAt(0)) )
                .collect( Collectors.toList() );*/

        System.out.println();
        System.out.println("Задание: 5");

        List<String> emails = List.of(
                "a@mail.com",
                "b@mail.com",
                "a@mail.com",
                "c@mail.com"
        );
        Set<String> res = emails.stream()
                .collect(Collectors.toSet());
        System.out.println(res);
    }
}
