package collections.arrayLists;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(7);
        number.add(10);

        System.out.println(number.size());
        System.out.println(number);

        System.out.println("lh;h" + number.get(0));
        System.out.println(number.get(1));
        System.out.println(number.get(2));

        for (Integer integer : number) {   // Printing all elements with for each
            System.out.println(integer);
        }
        for(int i = 0; i < number.size(); i++){
            System.out.println(number.get(i));
        }
        int countEven = 0;
        for(Integer numberr : number){
            if(numberr % 2 == 0) countEven++;
        }
        System.out.println(countEven);
    }
}
