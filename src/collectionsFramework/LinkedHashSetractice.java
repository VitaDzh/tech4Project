package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetractice {
    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("BAR");
        words.add(null);
        words.add("John");

        System.out.println(words); // keeps insertion order. Only one difference between HashSet

    }


}
