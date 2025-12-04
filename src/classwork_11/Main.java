package classwork_11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*  List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.set(0,20);
        arrayList.add(2,100);
        System.out.println(arrayList);

*/

      /*  for (int i = 0; i < arrayList.size(); i++) {
         if(arrayList.get(i) % 2 == 0){
             System.out.println(arrayList.get(i));
         }*/

   /*     List<String> names = new ArrayList<>();


        Collections.addAll(names,"BMW","Audi", "Porsche");
        Collections.sort(names);
        Collections.reverse(names);
        System.out.println(Collections.max(names));
        System.out.println(names);*/

Person person = new Person("Oleh");
Person person1 = new Person("Oleh");
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());


        Set<Person> personSet = new HashSet<>();
        personSet.add(person);
        personSet.add(person1);

        System.out.println(personSet);
        }
    }

