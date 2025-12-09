package homework_12;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        String sentence = "java is fun and java is powerful";
        String[] words = sentence.split(" "); //It`s unreal o_O! ChatGPT help me

        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        System.out.println("Количество уникальных слов: " + uniqueWords.size());
        System.out.println("Сами уникальные слова: " + uniqueWords);

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        HashSet<String> uniqueNumberCar = new LinkedHashSet<>();
        uniqueNumberCar.add("AM1654KM");
        uniqueNumberCar.add("BH0001XA");
        uniqueNumberCar.add("KM0200KM");
        uniqueNumberCar.add("BH0001XA");
        uniqueNumberCar.add("KA2481BA");

        for (String number : uniqueNumberCar) {
            uniqueNumberCar.add(number);
        }
        System.out.println("Количество уникальных номеров авто: "+ uniqueNumberCar.size());
        System.out.println("Уникальные номера(список): "+uniqueNumberCar);



    }
}
