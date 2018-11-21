import java.util.*;

public class HashMap {
    public static void main(String[] args) {

        //creating a hash map and adding KV pairs to it
        Map<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);
        map.put(3, "3");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(10));

        //iterating over the hash map
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}