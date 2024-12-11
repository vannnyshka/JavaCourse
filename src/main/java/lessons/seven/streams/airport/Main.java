//package lessons.seven.streams.airport;
//
//import com.skillbox.airport.Aircraft;
//import com.skillbox.airport.Flight;
//
//import java.util.*;
//
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        //Распечатайте с помощью библиотеки airport.jar время вылета и модели самолётов, вылетающих в ближайшие два часа
//        Aircraft aircraft = new Aircraft("Boing");
//        Aircraft aircraft1 = new Aircraft("Aerobus");
//        Calendar calendar = new GregorianCalendar();
//
//        List<Flight> flights = new LinkedList<>();
//
//        calendar.add(Calendar.HOUR, 5);
//        flights.add(new Flight("111", Flight.Type.ARRIVAL, calendar.getTime(), aircraft));
//
//        calendar.add(Calendar.HOUR, 2);
//        flights.add(new Flight("123", Flight.Type.ARRIVAL, calendar.getTime(), aircraft1));
//
//        calendar.add(Calendar.HOUR, 2);
//        flights.add(new Flight("333", Flight.Type.ARRIVAL, calendar.getTime(), aircraft1));
//
//        calendar.add(Calendar.HOUR, 5);
//        flights.add(new Flight("134", Flight.Type.DEPARTURE, calendar.getTime(), aircraft));
//
//        calendar.add(Calendar.HOUR, -6);
//        flights.add(new Flight("134", Flight.Type.DEPARTURE, calendar.getTime(), aircraft));
//
//        calendar.add(Calendar.HOUR, -7);
//        flights.add(new Flight("139", Flight.Type.ARRIVAL, calendar.getTime(), aircraft));
//
//        calendar.add(Calendar.MINUTE, 20);
//        flights.add(new Flight("1323", Flight.Type.DEPARTURE, calendar.getTime(), aircraft));
//
//        calendar.add(Calendar.MINUTE, 25);
//        flights.add(new Flight("999", Flight.Type.ARRIVAL, calendar.getTime(), aircraft1));
//
//        //время вылета и модели самолётов, вылетающих в ближайшие два часа
//        Calendar calendarBefore = new GregorianCalendar();
//        calendarBefore.add(Calendar.HOUR, 2);
//
//        flights.stream()
//                .filter(f -> f.getDate().before(calendarBefore.getTime()) && f.getDate().after(Calendar.getInstance().getTime()) && f.getType() == Flight.Type.ARRIVAL)
//                .forEach(System.out::println);
//
//
//
//    }
//
//
//}
