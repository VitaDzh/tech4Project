package collectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        /*
        How to create a HashSet
         */
        HashSet<Integer> numbers = new HashSet<>(); // to store kind of data that does not need to be called with indexes. to store SSN, phoneNumbers...
        numbers.add(5);
        numbers.add(10);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-9);
        numbers.add(9);
        System.out.println(numbers); // there is no order

    }
}
