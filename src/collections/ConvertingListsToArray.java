package collections;

import java.util.*;

public class ConvertingListsToArray {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rami");
        names.add("Naim");
        names.add("Reem");

        List<Integer> ages = new LinkedList<>();
        ages.add(25);
        ages.add(26);
        ages.add(27);
        ages.add(30);

        List<Boolean> booleans = new Vector<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);

        // Converting List to Array
        String[] namesArr = new String[names.size()];
        //WAY 1 manual
        for (int i = 0; i < names.size(); i++) {
            namesArr[i] = names.get(i);
        }
        System.out.println(Arrays.toString(namesArr));
        Object[] namesArr2 = names.toArray(); // toArray() method returns OBJECT always
        Object[] agesArr = ages.toArray();
        Object[] booleansArr = booleans.toArray();
        System.out.println(Arrays.toString(namesArr));
        System.out.println(Arrays.toString(agesArr));
        System.out.println(Arrays.toString(booleansArr));




    }
}
