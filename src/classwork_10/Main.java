package classwork_10;

public class Main {
    public static void main(String[] args) {
        Student1  student1 = new Student1();
        student1.name = "Vovka";
        student1.age = 20;
        Students2  student2 = new Students2();
        student2.name = "Karl";
        student2.age = 10;



    }


    public static void printInfo(Students2 students){
        String result =  students.name.equalsIgnoreCase("Vovka") ? "Tak" : "Nea";
        String result1 =  students.age > 18 ? "Young" : "Nea";
        System.out.println(result);
        System.out.println(result1);
    }

}
