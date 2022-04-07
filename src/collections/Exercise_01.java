package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Exercise_01 {
    public static void main(String[] args) {
        /*

         */

        String[] cities = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};
        LinkedList<String> citiesConverted = new LinkedList<>(Arrays.asList(cities));
        System.out.println(citiesConverted);
        citiesConverted.remove("Miami");
        citiesConverted.remove("Dallas");
        System.out.println(citiesConverted);

        LinkedList<String> citiesConverted1 = new LinkedList<>();
        Collections.addAll(citiesConverted1,cities);
        citiesConverted1.remove("Miami");
        citiesConverted1.remove("Dallas");
        System.out.println(citiesConverted);



    }
}
