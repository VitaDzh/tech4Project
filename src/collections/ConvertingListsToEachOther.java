package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListsToEachOther {
    public static void main(String[] args) {
        /*
        ArrayList to LinkedList and etc
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println(numbers);

        //Converting ArrayList to a LinkedList
        LinkedList<Integer> numbers2 = new LinkedList<>(numbers);
        System.out.println(numbers2);

        //Converting LinkedList to an ArrayList
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);
        System.out.println(numbers3);

        String[] namesArr = {"Kaly", "Torrie", "Taylor"};
        ArrayList<String> names = new ArrayList<>();

        Vector<String> namess = new Vector<>();
        Collections.addAll(namess, namesArr);
        System.out.println(namess);



    }
}
