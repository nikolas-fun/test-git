package Homework_06;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Ex3 {
   /* 3. Деление массива на число
    Есть массив:
    int[] arr = {10, 20, 30, 40};
    Пусть пользователь вводит индекс элемента и число, на которое нужно разделить элемент массива.
    Нужно обработать два исключения:
    ArrayIndexOutOfBoundsException — если человек ввёл несуществующий индекс
    ArithmeticException — если число, на которое делим, равно 0
    Вывести понятные сообщения об ошибках*/

    //индекс складывается из элементов. Пример 10, 20, 30,40 - это 4 элемента
    public void del(int[] array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of array");
        int index = sc.nextInt();
        System.out.println("Enter value");
        int value = sc.nextInt();

        try {
            int valueFromArray = array[index];//20
            int divide = valueFromArray / value;
            System.out.println(divide);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a.getMessage());
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        } finally {
            System.out.println();
        }


    }
}

