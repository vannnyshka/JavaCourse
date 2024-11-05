package lesson4.calendar;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int day = 11;
        int month = 10;
        int year = 2001;
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year - 1);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        for (int i = 0; !calendar.after(Calendar.getInstance()); i++) {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            //System.out.println(i + " - " + sdf.format(calendar.getTime()) + " - " + getDayOfWeekName(calendar));
            System.out.println(i + " - " + sdf.format(calendar.getTime()) + " - " + DayOfWeek.values()[calendar.get(Calendar.DAY_OF_WEEK) - 1].getName());

            calendar.add(Calendar.YEAR, 1);
            /*
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dateString = sdf.format(date);
            try {
                Date testDate = sdf.parse(dateString);
            } catch (ParseException e) {
                System.out.println("error");
            }
            */


        }

    }

    public static DayOfWeek getDayOfWeekName(Calendar calendar) {
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1: {
                return DayOfWeek.MONDAY;
            }
            case 2: {
                return DayOfWeek.TUESDAY;
            }
            case 3: {
                return DayOfWeek.WEDNESDAY;
            }
            case 4: {
                return DayOfWeek.THURSDAY;
            }
            case 5: {
                return DayOfWeek.FRIDAY;
            }
            case 6: {
                return DayOfWeek.SATURDAY;
            }
            case 7: {
                return DayOfWeek.SUNDAY;
            }
            default:
                return null;
        }
    }
}
