package homework_13;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String sentence = "apple orange apple banana orange apple";

        HashMap<String, Integer> uniqFruits = new HashMap<>();

        String[] words = sentence.split(" ");

        for (String w : words) {
            if (uniqFruits.containsKey(w)) {
                uniqFruits.put(w, uniqFruits.get(w) + 1);
            } else {
                uniqFruits.put(w, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : uniqFruits.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

PhoneBook obj = new PhoneBook();
        obj.addContact("Vova","+647515");
        obj.addContact("Nikita","+687515");

        System.out.println( obj.findPhone("Vova"));
        System.out.println(obj.findPhone("Oleh"));
        obj.printAll();
    }
}