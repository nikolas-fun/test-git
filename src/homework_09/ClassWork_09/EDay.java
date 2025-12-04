package homework_09.ClassWork_09;

public enum EDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

 public boolean dayOfWeek() {
     return this == SATURDAY || this == SUNDAY;
 }
}