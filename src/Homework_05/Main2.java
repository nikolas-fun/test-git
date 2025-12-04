package Homework_05;


public class Main2 {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }
        catch(ByZeroException e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("The end");
        }
    }
}
