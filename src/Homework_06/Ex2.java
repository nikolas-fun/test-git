package Homework_06;

public class Ex2 {
   /* 2. Чётное или нечётное
    Дано целое число n.
    Используя тернарный оператор, выведи "even" если число чётное, иначе "odd".*/
private int n;

public Ex2(int n){
	this.n=n;
}
 public void  setN(){

        String result = n %2 !=0 ? "odd" : "even";

        System.out.println(result);}
}
