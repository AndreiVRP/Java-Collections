import java.util.*;

public class LinkedListTest {
    public static void main(String[] agr) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

//        linkedList.add(23);
//        linkedList.add(99);
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.get(0));

        measurePopulateTime(linkedList);
        measurePopulateTime(arrayList);
        linkedList.clear();
        arrayList.clear();
        measurePopulateTimeWithIndex(linkedList);
        measurePopulateTimeWithIndex(arrayList);
        measureGetTime(linkedList);
        measureGetTime(arrayList);

        /*
        USE CASES:
        adding to the end of the list or reading data form the list -> use ArrayList (default choice)
        removing from the list or adding to the beginning of the list (or adding/removing quite a lot) -> use LinkedList
        */
    }

    public static void measurePopulateTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("The time spent on populating - " + list.getClass() + " = " + (end - start));
        System.out.println(list.size());
    }

    public static void measurePopulateTimeWithIndex(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("The time spent on populating with index - " + list.getClass() + " = " + (end - start));
        System.out.println(list.size());
    }

    public static void measureGetTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("The time spent on getting elements from - " + list.getClass() + " = " + (end - start));
        System.out.println(list.size());
    }


}

