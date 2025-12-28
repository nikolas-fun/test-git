package classwork_14;

import homework_14.Items;

import java.util.function.Function;

public class Main1 {
    public static void main(String[] args) {
        Function<Integer, String> f = i -> "String: " +  i;// преобразование числа в строку

        String result = f.apply(5);
        System.out.println(result);
    }
}
