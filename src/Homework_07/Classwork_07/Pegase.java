package Homework_07.Classwork_07;

public class Pegase extends Hource {
    public String krylaPegase;

    public Pegase(String name, String color, String age, String krylaPegase) {
        super(name, color, age);
        this.krylaPegase = krylaPegase;
    }

    public void printAboutPegase() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
        System.out.println(krylaPegase);
    }

}
