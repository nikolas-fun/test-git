package classwork_15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Sam", "Bob", "Tom", "Sergey", "Andrey", "Vasiliy", "Vitalik");
        List<Integer> listInt = List.of(1,5,4,7,9,2,3);
/*
        for(String x : list){
            if(x.length()>5){
                System.out.println(x.toUpperCase());
            }
        }*/

        list.stream()
                .filter(x -> x.length() > 5)
                .filter(x -> x.equalsIgnoreCase("Sergey"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
listInt.stream().filter(x -> x%2==0).map(x -> x*2).sorted().forEach(System.out::println);
    }
}
