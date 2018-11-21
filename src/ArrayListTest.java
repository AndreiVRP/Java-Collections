import java.lang.*;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        //initializing a dynamic array of integers
        List<Integer> arrayList = new ArrayList<>();

        //populating the array with numbers
        for (int i = 1; i < 12; i++) {
            arrayList.add(i);
        }

        //printing the array to the console by iterating over it and printing its elements one by one
        for (Integer number : arrayList) {
            String elementNumber = "Element number " + arrayList.get(number-1); //-1 is needed to avoid getting out of bounds
            System.out.println(elementNumber + " is " + number);
        }

        //obtaining elements by their indexes
        System.out.println("The 6th element is " + arrayList.get(5)); //this is the 6th element of the array since arrays start at 0

        //obtaining the size of the array
        System.out.println("The array contains " + arrayList.size() + " elements");

        //iterating over the array
        for (Integer n : arrayList) {
            System.out.println(n * 2);
        }

        //removing specific elements
        arrayList.remove(10); //if you addressed index 11, the system would throw an exception (the array contains only 10 elements, which is why index 11 is out of bounds).
        System.out.println(arrayList);

        //by default, the underlying array is 10 elements long, but we can extend it by setting the initial capacity if you can estimate the approximate amount of elements the array will eventually contain.
        //this is a good practice designed to avoid recreating the underlying array ech time a new element is created beyond the initial capacity.
        List<Integer> numbers = new ArrayList<>(100);

        for (int i = 1; i < 101; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);
        System.out.println(numbers.size());

    }
}
