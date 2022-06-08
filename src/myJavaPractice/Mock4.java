package myJavaPractice;

import java.util.*;

public class Mock4 {

    public static Map<String, Integer> uniqueElements(String[] arr){
        Map<String, Integer> map = new HashMap<>();
        for (String a : arr) {
            if(!map.containsKey(a)){
                map.put(a, 1);
            } else{
                map.put(a, map.get(a) +1);
            }
        }
        return map;
    }
    public static Map<String, Integer> whiteBoard(String[] array) {
        Map<String, Integer> newResult = new HashMap<>();
        int placeholder = 0;
        for (int i = 0; i < array.length; i++) {
            for (String str : array) {
                if (array[i].equals(str)) {
                    placeholder++;
                }
                newResult.put(array[i], placeholder);
            }
            placeholder = 0;
        }
        return newResult;
    }

    public static void occurrenceOfChars(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(!map.containsKey(c)){
                map.put(c, 1);
            } else{
                map.put(c, map.get(c) + 1);
            }
        }
        System.out.println(map);
    }

    public static void occurenceOfString(String str){
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] arr = str.split(" ");
        for (String a : arr) {
            if(map.get(a) != null){
                map.put(a, map.get(a) +1);
            } else{
                map.put(a, 1);
            }
        }
        System.out.println(map);
    }



    public static void main(String[] args) {
        String[] arr = {"Apple", "Apple", "Orange", "Apple", "Kiwi"};
        System.out.println(uniqueElements(arr));
        System.out.println(whiteBoard(arr));
    }

}
