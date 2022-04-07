package homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("------------------TASK 1---------------------");
        /*
        -Create an ArrayList and store below numbers
        10, 23, 67, 23, 78
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 2
        -Print the entire list
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("------------------TASK 2-----------------");
        /*
        -Create an ArrayList and store below colors
        Blue, Brown, Red, White, Black, Purple
        -Print element at index of 1
        -Print element at index of 3
        -Print element at index of 5
        -Print the entire list
         */
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("-------------------TASK 3------------------");
        /*
        -Create an ArrayList and store below numbers
        23, -34, -56, 0, 89, 100
        -Print the entire list
        -Print the entire list sorted in ascending order
         */
        List<Integer> numbersTask3 = new ArrayList<>();
        numbersTask3.add(23);
        numbersTask3.add(-34);
        numbersTask3.add(-56);
        numbersTask3.add(0);
        numbersTask3.add(89);
        numbersTask3.add(100);
        System.out.println(numbersTask3);
        Collections.sort(numbersTask3);
        System.out.println(numbersTask3);

        System.out.println("-----------------TASK 4-----------------");
        /*
        -Create an ArrayList and store below cities
        Istanbul, Berlin, Madrid, Paris
        -Print the entire list
        -Print the entire list sorted lexicographically
         */
        List<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("------------------TASK 5-----------------");
        /*
        -Create an ArrayList and store Marvel characters below
        Spider Man, Iron Man, Black Panter, Deadpool, Captain America
        -Print the entire list
        -Then, check if it contains Wolwerine
            if it contains Wolwerine, then print true
            if it does not contain Wolwerine, print false
         */
        List<String> marvel = new ArrayList<>();
        marvel.add("Spider Man");
        marvel.add("Iron Man");
        marvel.add("Black Panter");
        marvel.add("Deadpool");
        marvel.add("Capitan America");
        System.out.println(marvel);

        System.out.println(marvel.contains("Wolwerine"));


        System.out.println("-------------------TASK 6--------------------");
        /*
        -Create an ArrayList and store Avengers characters below
        Hulk, Black Widow, Captain America, Iron Man
        -Print the entire list sorted lexicographically
        -Then, check if it contains Hulk and Iron Man
	            if it contains both, then print true
	            if it does not contain both, print false
         */
        List<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Capitan America");
        avengers.add("Iron Man");
        System.out.println(avengers);

        boolean hasHulk = false, hasIMan = false;
        for (String avenger : avengers) {
            if(avenger.contains("Hulk"))
            hasHulk = true;
            if(avenger.contains("Iron Man"))
                hasIMan = true;
        } System.out.println(hasHulk && hasIMan);


        System.out.println("---------------TASK 7----------------");
        /*
        -Create an ArrayList and store characters below
        A, x, $, %, 9, *, +, F, G
        -Print the entire list
        -Print each element
         */
        List<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');
        System.out.println(chars);
        for (Character aChar : chars) {
            System.out.println(aChar);
        }

        System.out.println("--------------------TASK 8-------------------");
        /*
        -Create an ArrayList and store below objects
        Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
        -Print the entire list
        -Print the entire list sorted lexicographically
        -Count objects that starts with M or m
        -Count objects that does not have A or a or E or e
         */
        List<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int countM = 0, noAnoE = 0;
        for (String object : objects) {
            if(object.toLowerCase().startsWith("m")) countM++;
            if(!(object.toLowerCase().contains("a") || object.toLowerCase().contains("e"))) noAnoE++;
        }
        System.out.println(countM + "\n" + noAnoE);


        System.out.println("--------------TASK 9-------------");
        /*
        -Create an ArrayList and store below kitchen objects
        Plate, spoon, fork, Knife, cup, Mixer
        -Print the entire list
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements has P or p
        -Print how many elements starts or ends with P or p
         */
        List<String> kitchenOb = new ArrayList<>();
        kitchenOb.add("Plate");
        kitchenOb.add("spoon");
        kitchenOb.add("fork");
        kitchenOb.add("Knife");
        kitchenOb.add("cup");
        kitchenOb.add("Mixer");
        System.out.println(kitchenOb);

        int countUpper = 0, countLower = 0, countP = 0, countPStartEnd = 0;
        for (String s : kitchenOb) {
           if(Character.isUpperCase(s.charAt(0))) countUpper++;
           else countLower++;
           if(s.toLowerCase().contains("p")) countP++;
           if((s.toLowerCase().startsWith("p")) || s.toLowerCase().charAt(s.length()-1) == 'p') countPStartEnd++;
        }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements having P or p=  = " + countP);
        System.out.println("Elements starting or ending with P or p = " + countPStartEnd);


        System.out.println("----------------TASK 10----------------");
        /*
        -Create an ArrayList and store below numbers
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        -Print the entire list
        -Print how many element can be divided by 10
        -Print how many even numbers are greater than 15
        -Print how many odd numbers are less than 20
        -Print how many elements are less than 15 or greater than 50
         */
        List<Integer> numbers10 = new ArrayList<>();
        numbers10.add(3);
        numbers10.add(5);
        numbers10.add(7);
        numbers10.add(10);
        numbers10.add(0);
        numbers10.add(20);
        numbers10.add(17);
        numbers10.add(10);
        numbers10.add(23);
        numbers10.add(56);
        numbers10.add(78);
        System.out.println(numbers10);

        int countDivBy10 = 0, countMoreThan15 = 0, countLessThan15OrMore50 = 0, countLessThan20 = 0;
        for (Integer integer : numbers10) {
            if(integer % 10 == 0) countDivBy10++;
            if(integer % 2 == 0 && integer > 15) countMoreThan15++;
            if(integer % 2 != 0 && integer < 20) countLessThan20++;
            if(integer < 15 || integer > 50) countLessThan15OrMore50++;
        }
        System.out.println("Elements that can be divided by 10 = " + countDivBy10);
        System.out.println("Elements that are even and greater than 15 =  " + countMoreThan15);
        System.out.println("Elements that are odd and less than 20 =  " + countLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 =  " + countLessThan15OrMore50);
















    }
}
