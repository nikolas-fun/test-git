package homework_13;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

   HashMap<String,String> phoneBook = new HashMap<>();

    public void addContact (String name, String phone){
        phoneBook.put(name, phone);
    }

    public String findPhone(String name){
        return (phoneBook.containsKey(name) ? phoneBook.get(name) : "Not found");
    }
    public void printAll(){
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
    }


