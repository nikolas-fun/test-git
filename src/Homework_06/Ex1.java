package Homework_06;

public class Ex1 {
/*
    1. Определение большего числа
    Напиши программу, которая принимает два целых числа a и b
    и с помощью тернарного оператора выводит, какое число больше.
*/
private int a,b;
public Ex1 (int a,int b) {
this.a=a;
this.b=b;
}
public void CheckNumber() {
    String result = a > b ? "Yes  "+ a + " > " + b : "Sorry but " + a + " less than " + b;
    System.out.println(result);
}
}
