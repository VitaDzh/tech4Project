package collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Roma");
        capitals.put("US", "DC");
        capitals.put("Canada", "Ottawa");

        //Print a HashMap
        System.out.println(capitals); // it does not have insertion order

        LinkedHashMap<String, String> capitalss = new LinkedHashMap<>();
        capitalss.put("Ukraine", "Kiev");
        capitalss.put("Spain", "Madrid");
        capitalss.put("Portugal", null);
        capitalss.put("Italy", "Roma");
        capitalss.put("US", "DC");
        capitalss.put("Canada", "Ottawa");

        System.out.println(capitalss); // it will be in insertion order


        TreeMap<String, String> capitalsss = new TreeMap<>();
        System.out.println(capitalsss); // It will give us values with sorted keys

        /*
        How to get a particular key-value pair
         */
        System.out.println(capitals.get("Spain")); // Madrid. it always required u to get a value from a key
        System.out.println(capitals.get("Germany")); // if there is no such key, it will give u a null

        System.out.println("---------------------------------------");
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Alona");
        students.put(2, "Abdullah");
        students.put(3, "Abdullah");
        students.put(4, "Data");
        students.put(null, "Data");
        students.put(null, "Data"); // will not add because key are always unique
        students.put(1, "Daria"); // it's reassignment . u call same key, u are update value
        students.put(5, null);
        students.put(6, null);
        students.put(null, null); // it's reassignment . u call same key, u are update value

        System.out.println(students);
        System.out.println(students.size());






    }
}
