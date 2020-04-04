package c5.z5_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arr = {
                "office A", "John", "Doe",
                "office B", "John", "Brown",
                "office C", "Mary", "Jones",
                "office B", "Adam", "Rust",
                "office C", "Cindy", "Frost",
                "office A", "Kate", "Coe",
                "office A", "Bill", "Brown"
        };

        Map<String, List<Person>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i += 3) {
            if (!map.containsKey(arr[i])) {
                ArrayList<Person> list = new ArrayList<>();
                map.put(arr[i], list);
            }
            map.get(arr[i]).add(new Person(arr[i + 1], arr[i + 2]));
        }

        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key) + ":" + map.get(key).size());
        }
    }
}
