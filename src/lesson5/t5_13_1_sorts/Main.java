package lesson5.t5_13_1_sorts;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Long> timesOfSearch = new HashMap<>();

        List<String> carNumbsAr = new ArrayList<>();
        Set<String> carNumbsHash = new HashSet<>();
        Set<String> carNumbsTree = new TreeSet<>();

        String num = "";

        for (int i = 0; i < 1000000; i++) {
            num = generateNum().toString();
            carNumbsAr.add(num);
            carNumbsHash.add(num);
        }

        carNumbsTree.addAll(carNumbsHash);

        System.out.println("Ищем номер: "+num);

        long ms = Calendar.getInstance().getTimeInMillis();

        for (int i = 0; i < carNumbsAr.size(); i++) {
            if (carNumbsAr.get(i).equals(num)) {
                System.out.println("true search");
                break;
            }
        }

        ms = Calendar.getInstance().getTimeInMillis() - ms;
        timesOfSearch.put("ArraySearch", ms);
        System.out.println("Поиск перебором ArrayList: " + ms);


        Collections.sort(carNumbsAr);

        ms = Calendar.getInstance().getTimeInMillis();

        System.out.println(Collections.binarySearch(carNumbsAr, num));

        ms = Calendar.getInstance().getTimeInMillis() - ms;
        timesOfSearch.put("ArrayBinary", ms);
        System.out.println("Поиск бинарный ArrayList: " + ms);


        ms = Calendar.getInstance().getTimeInMillis();
        System.out.println(carNumbsHash.contains(num));

        ms = Calendar.getInstance().getTimeInMillis() - ms;
        timesOfSearch.put("HashSeach", ms);
        System.out.println("Поиск HashSet: " + ms);


        ms = Calendar.getInstance().getTimeInMillis();
        System.out.println(carNumbsTree.contains(num));

        ms = Calendar.getInstance().getTimeInMillis() - ms;
        timesOfSearch.put("HashSeach", ms);
        System.out.println("Поиск TreeSet: " + ms);


        searchMaxValue(timesOfSearch);

    }

    public static StringBuilder generateNum() {

        /*XYZ — различные буквы, N — цифры, R — регион (от 01 до 199);
        X NNN YZR */
        /*Math.random() * (max - min + 1)) + min*/
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append((char) (Math.random() * ('Z' - 'A' + 1) + 'A'));
        stringBuilder.append((int) (Math.random() * 900 + 100));
        stringBuilder.append((char) (Math.random() * ('Z' - 'A' + 1) + 'A'));
        stringBuilder.append((char) (Math.random() * ('Z' - 'A' + 1) + 'A') + (int) (Math.random() * 199 + 1));
        return stringBuilder;

    }

    public static void searchMaxValue(Map<String, Long> map) {

        //Map.Entry<String, Double> maxEntry = Collections.max(map.entrySet(), (Map.Entry e1, Map.Entry e2) -> e1.getValue().compareTo(e2.getValue()));

        Map.Entry<String, Long> maxEntry = Collections.min(map.entrySet(), Map.Entry.comparingByValue());

        System.out.println("Самый быстрый поиск был у " + maxEntry.getKey() + " и занял " + maxEntry.getValue() + " мс");

    }
}
