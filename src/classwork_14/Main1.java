package classwork_14;

import homework_14.Items;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main1 {
    public static void main(String[] args) {
        /*Function<Integer, String> f = i -> "String: " +  i;// преобразование числа в строку

        String result = f.apply(5);
        System.out.println(result);*/

/*//        Box <Integer> box = new Box<>();
//        box.item = 10;
//        Integer number = box.print(box.item);// 10
//        System.out.println(number);


//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String o) {
//                System.out.println("Value: " + o);
//            }
//        };
//
//        consumer.accept("Hello");

        *//*Consumer<String> consumer = (v) -> System.out.println("Value: " + v);
        consumer.accept("Hello");*//*

        MyFanctionI<Integer, Integer, Integer> sale = (price, discount) ->  price - (price * discount/100);
        Integer result = sale.process(5,50);
        System.out.println(result);*/
    }
}
