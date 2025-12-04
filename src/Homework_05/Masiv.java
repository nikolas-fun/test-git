package Homework_05;
import java.awt.datatransfer.StringSelection;

public class Masiv {
/*
    3. Массивы — "Средняя температура"
    Тема: Работа с массивами
    Описание:
    Создай программу, которая:
    Хранит массив температур за неделю (например, double[] temps = {18.5, 20.3, 22.0, 21.4, 19.8, 17.9, 18.2});
    Находит среднее значение температуры;
    Выводит температуру, которая была максимальной;
*/

    public void average(double[] temps ){
        double sum = 0;
        for( int i = 0; i < temps.length; i++ ){
            sum += temps[i];
        }
        System.out.println(sum/temps.length);
    }
    public void average2(double[] temps ){
        double max = temps[0];
        for( int i = 0; i < temps.length; i++ ){
            if(temps[i] > max){
                max = temps[i];
            }
        }
        System.out.println(max);
    }
}
