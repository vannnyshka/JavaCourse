package lessons.eight.otladka.test;

import junit.framework.TestCase;
import lessons.eight.otladka.java.RouteCalculator;
import lessons.eight.otladka.java.StationIndex;
import lessons.eight.otladka.java.core.Line;
import lessons.eight.otladka.java.core.Station;


import java.util.*;

public class RouteCalculateTest extends TestCase {

    List<Station> route;
    RouteCalculator routeCalculator;

    Station stationFromOnTheLine;
    Station stationToOnTheLine;

    Station stationFromWithOneConnection;
    Station stationToWithOneConnection;

    Station stationFromWithTwoConnection;
    Station stationToWithTwoConnection;

    //инициализировать какие-то данные
    @Override
    protected void setUp() throws Exception {
        route = new ArrayList<>();

        Line lineOne = new Line(1, "Первая");
        Line lineTwo = new Line(2, "Вторая");


        Station flowers = new Station("Цветочная", lineOne);
        Station watermelon = new Station("Арбузная", lineOne);


        route.add(new Station("Зеленая", lineOne));
        route.add(flowers);
        route.add(new Station("Красная", lineOne));
        route.add(new Station("Yellow", lineOne));
        route.add(watermelon);
        route.add(new Station("Blue", lineOne));
        route.add(new Station("Морковная", lineTwo));
        route.add(new Station("Яблочная", lineTwo));


        //Создание объекта RouteCalculator
        TreeSet<Station> stations = new TreeSet<>();
        HashMap<Integer, Line> number2line = new HashMap<>();

        Line line1 = new Line(1, "Синяя");

        Station okt = new Station("Октябрьская", line1);
        Station lenin = new Station("Площадь Ленина", line1);
        stationToWithOneConnection = new Station("Площадь Якуба Коласа", line1);

        List<Station> stationOnLine1 = Arrays.asList(
                new Station("Уручье", line1),
                new Station("Борисовский тракт", line1),
                new Station("Восток", line1),
                new Station("Московская", line1),
                new Station("Парк Челюскинцев", line1),
                stationToWithOneConnection,
                new Station("Площадь Победы", line1),
                okt, lenin,
                new Station("Институт Культуры", line1),
                new Station("Грушевка", line1),
                new Station("Михалово", line1),
                new Station("Петровщина", line1),
                new Station("Малиновка", line1)
        );

        line1.addStations(stationOnLine1);
        stations.addAll(stationOnLine1);

        Line line2 = new Line(2, "Красная");

        Station frunz = new Station("Фрунзенская", line2);
        Station kupal = new Station("Купаловская", line2);
        stationToOnTheLine = new Station("Пролетарская", line2);
        stationFromOnTheLine = new Station("Автозаводская", line2);

        stationFromWithOneConnection = new Station("Первомайская", line2);

        stationToWithTwoConnection = new Station("Тракторный завод", line2);

        List<Station> stationOnLine2 = Arrays.asList(
                new Station("Каменная горка", line2),
                new Station("Кунцевщина", line2),
                new Station("Спортивная", line2),
                new Station("Пушкинская", line2),
                new Station("Молодежная", line2),
                frunz,
                new Station("Немига", line2),
                kupal,
                stationFromWithOneConnection,
                stationToOnTheLine,
                stationToWithTwoConnection,
                new Station("Партизанская", line2),
                stationFromOnTheLine,
                new Station("Могилевская", line2)
        );

        line2.addStations(stationOnLine2);
        stations.addAll(stationOnLine2);


        Line line3 = new Line(3, "Зеленая");

        Station ubil = new Station("Площадь Юбилейная", line3);
        Station vokzal = new Station("Вокзальная", line3);
        stationFromWithTwoConnection = new Station("Ковальская Слобода", line3);

        List<Station> stationOnLine3 = Arrays.asList(
                ubil,
                new Station("Площадь Франтишка Богушевича", line3),
                vokzal,
                stationFromWithTwoConnection
        );

        line3.addStations(stationOnLine3);
        stations.addAll(stationOnLine3);

        number2line.put(1, line1);
        number2line.put(2, line2);
        number2line.put(3, line3);

        TreeMap<Station, TreeSet<Station>> connections = new TreeMap<>();

        TreeSet<Station> connectedWithKupal = new TreeSet<>();
        connectedWithKupal.add(okt);

        connections.put(kupal, connectedWithKupal);

        TreeSet<Station> connectedWithOkt = new TreeSet<>();
        connectedWithKupal.add(kupal);

        connections.put(okt, connectedWithOkt);

        TreeSet<Station> connectedWithUbil = new TreeSet<>();
        connectedWithKupal.add(frunz);

        connections.put(ubil, connectedWithUbil);

        TreeSet<Station> connectedWithFrunz = new TreeSet<>();
        connectedWithKupal.add(ubil);

        connections.put(frunz, connectedWithFrunz);

        TreeSet<Station> connectedWithLenin = new TreeSet<>();
        connectedWithKupal.add(vokzal);

        connections.put(lenin, connectedWithLenin);

        TreeSet<Station> connectedWithVokzal = new TreeSet<>();
        connectedWithKupal.add(lenin);

        connections.put(vokzal, connectedWithVokzal);

        StationIndex stationIndex = new StationIndex(number2line, stations, connections);

        routeCalculator = new RouteCalculator(stationIndex);

        //------------------Закончили создание RouteCalculator


    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 18.5;
        assertEquals(expected, actual);
    }

    public void testGetShortestRouteOnTheLine() {

        List<Station> actual = routeCalculator.getShortestRoute(stationFromOnTheLine, stationToOnTheLine);

        List<Station> expected = new ArrayList<>();
        Line line2 = new Line(2, "Красная");
        expected.add(new Station("Автозаводская", line2));
        expected.add(new Station("Партизанская", line2));
        expected.add(new Station("Тракторный завод", line2));
        expected.add(new Station("Пролетарская", line2));

        assertEquals(expected, actual);
    }


    public void testGetShortestRouteWithOneConnection() {

        List<Station> actual = routeCalculator.getShortestRoute(stationFromWithOneConnection, stationToWithOneConnection);

        List<Station> expected = new ArrayList<>();
        Line line2 = new Line(2, "Красная");
        Line line1 = new Line(1, "Синяя");

        expected.add(new Station("Первомайская", line2));
        expected.add(new Station("Купаловская", line2));
        expected.add(new Station("Октябрьская", line1));
        expected.add(new Station("Площадь Победы", line1));
        expected.add(new Station("Площадь Якуба Коласа", line1));

        assertEquals(expected, actual);
    }


    //удалить какие-то данные
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
