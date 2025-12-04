package Homework_04;

import org.w3c.dom.ls.LSOutput;

public class Sw1 {
   /* 1. Подсчитать количество чётных чисел
    Условие:
    Дан массив чисел. Найди, сколько в нём чётных элементов.
            Пример:
    Ввод: int[] arr = {2, 5, 8, 11, 14};
    Вывод: Количество чётных чисел: 3*/
 /*  int [] arr = {2, 5, 8, 11, 14};
   for(int i = 0, i < arr.length, i++);
   System.out.println(arr.length) ;
*/

    public void sum(int [] array){
        int count =0;
        for (int i = 0; i < array.length; i++) {

            if(array[i] %2 !=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
