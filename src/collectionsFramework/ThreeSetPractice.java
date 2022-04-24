package collectionsFramework;

import java.util.TreeSet;

public class ThreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
       // numbers.add(null); does not take null, cause it sorts array. Compiler does not give an error, but JVM runs and give u NullPointerException
        System.out.println(numbers);

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Joe");
        names.add("Alex");
        names.add("ali");
        System.out.println(names);




    }
}
