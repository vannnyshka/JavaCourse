package lesson4.calendar;

public enum DayOfWeek {
    SUNDAY("Sun"),
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat");


    private String name;

    DayOfWeek(String name) {
        this.name = name;
    }

    public static DayOfWeek[] getWorkDays() {
        return new DayOfWeek[]{MONDAY, TUESDAY};
    }

    public String getName() {
        return name;
    }

}
