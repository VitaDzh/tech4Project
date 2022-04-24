package collectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Exercize01_remove_duplicates {
    public static void main(String[] args) {
        /*
        Create arrList and store el. REmove all duplicates
         */
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        System.out.println("----------------Loop way-------------");
        ArrayList<String> newOne = new ArrayList<>();
        for (String s : objects) {
            if(!newOne.contains(s)) newOne.add(s);
        }
        System.out.println(newOne);

        System.out.println("---------------HashSet Way-------------");
        //LinkedHashSet<String> noDuplic = new LinkedHashSet<>(objects);
        System.out.println(new LinkedHashSet<>(objects));






    }

}
