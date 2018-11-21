import java.util.*;

//NOTE: Never call a new class the same as the existing class in the library (ex. Sets instead of Set)!
public class Sets {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); //unordered
        Set<String> linkedHashSet = new LinkedHashSet<>(); //ordered (they way they were added)
        Set<String> treeSet = new TreeSet<>(); //ordered - sorted

        testSet(hashSet);
        testSet(linkedHashSet);
        testSet(treeSet);

        searchName(hashSet, "Jessy");
        searchName(hashSet, "Billy");
        searchName(linkedHashSet, "Tim");
        searchName(linkedHashSet, "Bob");
        searchName(treeSet, "John");
        searchName(treeSet, "Adam");
        System.out.println();

        //working with 2 sets
        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();
        populateSet(setA, 1, 20);
        populateSet(setB, 10, 30);
        System.out.println(setA);
        System.out.println(setB);

        //union
        Set<Integer> union = new TreeSet<>(setA);
        union.addAll(setB);
        System.out.println("UNION: " + union);

        //intersection
        Set<Integer> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("INTERSECTION: " + intersection);

        //difference
        Set<Integer> difference = new TreeSet<>(setA);
        difference.removeAll(setB);
        System.out.println("DIFFERENCE: " + difference );
    }

    public static void testSet(Set<String> set) {
        set.add("John");
        set.add("Mike");
        set.add("Tim");
        set.add("Jessy");
        set.add("John");

        System.out.println(set.getClass());
        for(String item : set) {
            System.out.println(item);
        }
        System.out.println();
    }

    public static void searchName(Set<String> set, String name) {
        if (set.contains(name)) {
            System.out.println("Yay! " + name + " is found!");
        } else {
            System.out.println("Sorry! " + name + " is not on list!");
        }
    }

    public static void populateSet(Set<Integer> set, int from, int through) {
        for (int i = from; i < through+1; i++) {
            set.add(i);
        }
    }
}
