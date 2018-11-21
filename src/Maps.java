import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args){
        Map<Integer, String> hashMap = new HashMap<>(); // unordered
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // ordered (in the sequence the KV pairs were added)
        Map<Integer, String> treeMap = new TreeMap<>(); // ordered by key + sorting criteria should be specified

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "John");
        map.put(12, "Mike");
        map.put(99, "Tim");
        map.put(111, "Jessy");
        map.put(77, "John");

        System.out.println(map.getClass());
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
