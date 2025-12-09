package classwork_12;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Map
        // key --- value

        Map<String, Integer> map = new HashMap<>();
        map.put("Dania", 358740);
        map.put("Oleh", 358740);

        for(String key : map.keySet()) {
            System.out.println(key);
        }// get keys

        for(Integer i : map.values()) {
            System.out.println(i);
        }// get values

        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }// get keys and values
    }
}
