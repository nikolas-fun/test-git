package homework_09.ClassWork_09;

public interface IMainDepartment {
    void createReport();

    default void inviteToCelebrateNewYear(){
        System.out.println("Happy New Year!!");
    }
}
