package lesson5.t5_11_1_map;

import java.util.HashMap;
import java.util.Map;

public class EntryTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Fyn");
        map.put(2,"Jup");
        map.put(3,"fhth");

        for (Map.Entry entry: map.entrySet()) {

            entry.getKey();
            entry.getValue();
            System.out.println(entry);

        }

    }
}
