package collections.linkedLists;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);
        System.out.println(numbers);

        System.out.println("--------Loop with LinkedList---------");
        System.out.println("FOR EACH LOOP");
        for (Double d : numbers) {
            System.out.println(d);
        }
        System.out.println("FORI LOOP");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("---------Printing elements-----------");
        System.out.println(numbers.get(0)); // 10.5
        System.out.println(numbers.getFirst());// 10.5
        System.out.println(numbers.getLast()); // 17.7

        System.out.println("---------Some additional methods of LinkedLink----------");
        System.out.println(numbers.peek()); // getFirst() 10.5
        System.out.println(numbers.peekLast()); // last element 17.7

        System.out.println(numbers);
        System.out.println("\n-----------------------------");

        System.out.println(numbers.poll());
        System.out.println(numbers.pollFirst()); // get the first el and removes it
        System.out.println(numbers.pollLast()); // get the first el and removes it
        System.out.println(numbers);

        numbers.push(5.7); //add the value to the beginning --> first index
        numbers.push(8.9);
        System.out.println(numbers.pop()); // removes the object from the head
        System.out.println(numbers);














    }
}
