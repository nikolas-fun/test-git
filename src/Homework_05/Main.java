package Homework_05;
public class Main {
    public static void main(String[] args) {
/*Movie movie1 = new Movie("Balabol", 9.3);
movie1.showInfo();
movie1.isGoodMovie();

        System.out.println();

StringPool stringPool = new StringPool();
        stringPool.setInput("JavaRocks");
        stringPool.checkPassword();*/
        double[] temps = {18.5, 20.3, 22.0, 21.4, 19.8, 17.9, 18.2};
        Masiv masiv = new Masiv();
        masiv.average(temps);
        masiv.average2(temps);

    }
}
