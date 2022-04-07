package collections.arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoopingThroughArrayListElements {
    public static void main(String[] args) {

        //ArrayList<Character> chars = new ArrayList<>();
        List<Character> charss = new ArrayList<>();
        charss.add('D');
        charss.add('A');
        charss.add('B');
        charss.add('C');
        System.out.println("My list before sort " + charss);

        Collections.sort(charss);
        System.out.println("Sorted " + charss);

        System.out.println("----------Printing with FOR EACH LOOP----------");
        for (Character character : charss) {
            System.out.println(character);
        }
        System.out.println("----------Printing with FORI LOOP----------");

        for (int i = 0; i < charss.size(); i++) {
            System.out.println(charss.get(i));
        }








    }
}
