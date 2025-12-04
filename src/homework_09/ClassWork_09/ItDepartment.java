package homework_09.ClassWork_09;

public class ItDepartment implements IMainDepartment, IActionForIT {
    @Override
    public void createReport() {
        System.out.println("IT Department created report");
    }


    @Override
    public void createApp() {
        System.out.println("IT Department created an app");
    }

}
