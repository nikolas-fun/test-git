package homework_09.ClassWork_09;

public class Main {
    public static void main(String[] args) {

     /*   IMainDepartment it1 = new ItDepartment();
        IActionForIT it2 = new ItDepartment();
        it1.createReport();
        it2.createApp();
        it1.inviteToCelebrateNewYear();
*/
        EDay day = EDay.SATURDAY;

        if(day.dayOfWeek()){
            System.out.println("It is a weekday!");
        }
        else{
            System.out.println("It isn`t a weekday!");
        }
    }
}
