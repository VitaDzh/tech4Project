package collections;

import java.util.*;

import static java.util.Arrays.asList;

public class ConvertingArrayToList {
    public static void main(String[] args) {
        /*
        Create a List and store below data - countries
        USA, Bra
         */
        LinkedList<String> countries = new LinkedList<>();
        countries.add("USA");
        countries.add("Brazilia");
        countries.add("Argentina");
        countries.add("France");
        countries.add("Belgium");
        countries.add("Germany");
        countries.add("Portugal");
        System.out.println(countries);

        String[] countries1 = {"USA", "Brazilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};
        // WAY 1 convert Array to List
        List<String> convert1 = new LinkedList<>(Arrays.asList(countries1));
        System.out.println(convert1);

        // Way 2 convert Array to List
        List<String> converted = new LinkedList<>();
        Collections.addAll(converted, countries1);
        System.out.println(converted);

        // Third Way - manual











    }
}
