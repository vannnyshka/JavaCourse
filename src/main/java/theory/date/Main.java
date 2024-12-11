package theory.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {


        System.out.println("--------------------------------------LocalDate--------------------------------------");
        System.out.println("Получаем сегодняшнюю дату LocalDate.now(): ");
        System.out.println(LocalDate.now()); //2024-11-13
        System.out.println();

        System.out.println("Попробуем создать объект класса LocalDate.\nLocalDate ldate = LocalDate.of(2001, 10, 11): ");
        LocalDate ldate = LocalDate.of(2001, 10, 11);
        System.out.println(ldate);
        System.out.println();
        System.out.println("Можно отдельно вычленить год, день, месяц, день недели.\nК примеру, день недели ldate.getDayOfWeek():");
        System.out.println(ldate.getDayOfWeek());
        System.out.println();
        System.out.println("Также можно добавлять дни, месяцы, года. К примеру: ldate.plusMonths(11)");
        System.out.println(ldate.plusMonths(11));
        System.out.println();



        LocalDate.of(2020, Month.SEPTEMBER, 23); // 2020-09-23
        LocalDate.of(2021, 1, 1); // 2021-01-01
        LocalDate.ofYearDay(2020, 361); // 2020-12-26

        System.out.println("--------------------------------------LocalTime--------------------------------------");
        System.out.println("Получаем сегодняшнее время LocalTime.now(): ");
        System.out.println(LocalTime.now());  //16:41:41.114
        System.out.println();
        LocalTime.of(12, 10); // 12:10
        LocalTime.of(18, 15, 10); // 18:15:10
        LocalTime.of(23, 59, 59, 700); // 23:59:59.000000700
        LocalTime.ofSecondOfDay(9_124); // 02:32:04
        LocalTime.ofNanoOfDay(100_000_000_000L); // 00:01:40

        System.out.println("--------------------------------------LocalDateTime--------------------------------------");
        System.out.println("Получаем дату, время LocalDateTime.of(LocalDate.now(), LocalTime.now()):");
        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now())); //2024-11-13T16:43:19.523
        System.out.println();


        //Calendar - работа с датами: отнять месяцы, дни, высокосный ли год, получить отдельные компоненты даты
        System.out.println("--------------------------------------Calendar--------------------------------------");
        int day = 11;
        int month = 10;
        int year = 2001;

        System.out.println("Создать объект класса календарь - надо выбрать какой календарь конкретно, в нашем случае - грегорианский.\nCalendar calendar = new GregorianCalendar():");
        Calendar calendar = new GregorianCalendar();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        //не очень вид
        System.out.println("Созданный объект класса Calendar: ");
        System.out.println(calendar);
        System.out.println("Принтуем объект класса Calendar и метод getTime: calendar.getTime(). Вид не оч: ");
        System.out.println(calendar.getTime()); //Sun Nov 11 16:57:11 MSK 2001 - выводит всю инфу по этому дню по грегор календарю
        System.out.println();


        System.out.println("--------------------------------------SimpleDateFormat--------------------------------------");
        System.out.println("Преобразовать дату в удобный формат. Создаем формат SimpleDateFormat sdf = new SimpleDateFormat(\"dd/MM/yyyy\"):");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Задали формат объекту класса Calendar. sdf.format(calendar.getTime()):");
        System.out.println(sdf.format(calendar.getTime())); //преобразовываем
        System.out.println();

        System.out.println("Так же в классе календарь можно добавлять к дате года, месяцы, дни и тд. calendar.add(Calendar.YEAR, 1):");
        calendar.add(Calendar.YEAR, 1);
        System.out.println("sdf.format(calendar.getTime()):");
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println();

        //Всякие шняги можно из этой Instance получить
        System.out.println("Один из статическких методов класса Calendar.");
        System.out.println("Просто используем метод у класса Calendar, чтобы получить информацию о всем текущем времени, зоне, и т.д:");
        System.out.println(Calendar.getInstance());
        System.out.println();
        //К примеру - время в милисекундах
        System.out.println("Можно вывести время в милисекундах: ");
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println();


        //Преобразовать стринг обратно в дату:
        Date date = calendar.getTime();
        String dateString = sdf.format(date);
        try {
            Date testDate = sdf.parse(dateString);
            System.out.println(testDate);
        } catch (ParseException e) {
            System.out.println("error");
        }



    }

}
