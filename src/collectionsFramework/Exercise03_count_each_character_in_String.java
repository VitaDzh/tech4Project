package collectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise03_count_each_character_in_String {
    public static void main(String[] args) {

        /*
        Count each character
         */
        String word = "Chicago is a nice city";
        LinkedHashMap<Character, Integer> charCounts = new LinkedHashMap<>();
        for (Character character : word.toCharArray()) {
            if(!charCounts.containsKey(character)) charCounts.put(character, 1);
            else charCounts.put(character, charCounts.get(character) + 1);
        }
        for(Map.Entry entry : charCounts.entrySet()){
            System.out.println(entry);
        }



    }
}
