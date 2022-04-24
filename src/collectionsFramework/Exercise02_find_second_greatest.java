package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_find_second_greatest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);

        new TreeSet<>(numbers);
        System.out.println(numbers); // sorted
        //Since TreeSet does not has get method, we should convert to arrayList
        ArrayList<Integer> uniques = new ArrayList<>(numbers);
        System.out.println(uniques.get(uniques.size()-2)); // second MAX
        System.out.println(uniques.get(uniques.get(1))); // second MIN

        /*
        ArrayList<Integer> uniques = new ArrayList<>(new TreeSet<>(numbers)); // here is a new object into constructor
        System.out.println(uniques.get(uniques.size()-2));
         */





    }
}
