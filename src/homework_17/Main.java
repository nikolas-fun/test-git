package homework_17;

public class Main {
    public  static void main(String[] args) {
     /* ДЗ_1  Проверить:
        строку "Java"
        В случае строки проверить длину переданной строки больше ли она 5
        В случае числа проверять больше ли число пяти*/

        /*MyInterface<String> test1 = (x) -> x.length() > 5;
        boolean result = test1.test("Java");
        System.out.println(result);*/

        MyFanction<String, Integer> check1 = (x) -> x.length() ;
        MyFanction<Integer, String> check2 = (x) -> String.valueOf(x);
        System.out.println(check2.apply(5)+5);

    }
}
