package theory.dates;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Проверка до 19.00 - вернуть сегодня
        Date current = new Date();
        System.out.println(cutDate(current));

        //Проверка после 19.00 - вернуть завтра
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(current);
        calendar.add(Calendar.HOUR, 8);
        System.out.println(cutDate(calendar.getTime()));

        //Проверка после 19.00 - вернуть завтра
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(current);
        calendar1.add(Calendar.DAY_OF_MONTH, 8);
        System.out.println(cutDate(calendar1.getTime()));

    }

    private static Date cutDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (calendar.get(Calendar.HOUR_OF_DAY) > 19) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return resetToZeroTime(calendar);
    }

    private static Date resetToZeroTime(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}
