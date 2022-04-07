package collections.arrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        //[Java, JavaScript, C#, Python, C++]

        /*
        TASK
        Remove Python from the list and print it
        [Java, JavaScript, C#, C++]
         */
        System.out.println("-------TASK 1--------");
        languages.remove("Python");
        System.out.println(languages);

        System.out.println("---------TASK 2-------");
        /*
        Remove all elements that startswith "J"
         */
        System.out.println("---------FOR EACH LOOP---------");
        LinkedList<String> forRemoving = new LinkedList<>();
        for (String language : languages) {
            if(language.startsWith("J")) forRemoving.add(language);
        }
        languages.removeAll(forRemoving);
        System.out.println(languages);

        System.out.println("----------FORI LOOP--------");
        for (int i = 0; i < languages.size(); i++){
            if (languages.get(i).toLowerCase().charAt(0) == 'j'){
                languages.remove(languages.get(i));
                i--;
            }
        } System.out.println(languages);

        languages.removeIf(language -> language.startsWith("J")); // checking each element and then removing element if it starts with J


        //USING ITERATOR

        Iterator<String> iterator = languages.iterator(); // I put all elements in a queue

        while(iterator.hasNext()){ // We are asking if there is an element in the queue
            String element = iterator.next(); // this gets an element from the queue
            if(element.startsWith("J")) { // if element came from the queue starts with J
                iterator.remove(); // Remove
            }
        }
        System.out.println(languages);







    }
}
