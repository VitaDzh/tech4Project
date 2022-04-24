package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {

        System.out.println("-----------int array--------------");
    /*
    Create an int array and store data and print
     */
        int[] arr = {1, 5, 7, 9, 10};
        System.out.println(Arrays.toString(arr));
        // null is not allowed

        System.out.println("-----------String Array--------------");

        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));

        System.out.println("-----------String Array--------------");
        //U can create objects with using parent class, but u'll lose some data and u DO NOT WANT IT. Usually u do not do that
        //Showing that child can create object in shape of parent
        ArrayList<String> names1 = new ArrayList<>(); // the most complex the child of all
        List<String> names2 = new ArrayList<>(); // when u want to create collection of multiple collections
        Collection<String> names3 = new ArrayList<>();
        Iterable<String> names4 = new ArrayList<>();
        Object names5 = new ArrayList<>();

        /*
        List: ArrayList - Vector - LinkedList
         */
        System.out.println("----------String arraysList-----------");
        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, cities);
        cities2.add("Tokyo"); // will go to the end of an Array, it keeps insertion order
        System.out.println(cities2);

        System.out.println("----------String vectorList-----------");

        Vector<String> cities3 = new Vector<>(cities2); // converting cities2 to cities3

        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size());
        names.forEach(System.out::println);
        System.out.println("names at index of 5 = " + names.get(5));

        System.out.println("--------String LinkedList---------");
        LinkedList<String> objects1 = new LinkedList<>();
        List<String> object2 = new ArrayList<>(); // it acts as a List, so does not have methods

        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);

        System.out.println(objects1.getLast());

        System.out.println(objects1.stream().filter(Objects::isNull).count());


    }
}
