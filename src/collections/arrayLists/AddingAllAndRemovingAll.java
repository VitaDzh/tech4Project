package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args) {

        //TASK - 1. Create an arrayList of german cars and add : BMW, Mercedes, Volkswagen. Print the list
        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars: " + germanCars);

        /*
        TASK-2
        Create an ArrayList of japanese cars: Honda, Toyota, Lexus. Print
         */
        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");
        System.out.println("Japanese cars: " + japaneseCars);


        /*
        TASK - 3. Luxury cars ArrayList:  Maserati, Tesla, Range Rover, Jaguar
         */
        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");
        System.out.println("Luxury cars: " + luxuryCars);

        System.out.println("------------Put all together-----------");
        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("Inventory at the beginning = " + inventory);
        inventory.addAll(germanCars);
        System.out.println("German cars in inventory: " + inventory);

        //Adding all luxury cars to the inventory Array
        inventory.addAll(luxuryCars);
        System.out.println("Luxury cars in inventory: " + inventory);

        inventory.addAll(1, japaneseCars); // put collection to a index 1 of inventory
        System.out.println("Japanese cars in inventory " + inventory);

        inventory.removeAll(japaneseCars);
        System.out.println("Inventory after removing Japanese cars: " + inventory);



           /*
        Remove Tesla, BMW
         */

        inventory.remove("Tesla");
        inventory.remove("BMW");
        inventory.remove(3); // removing element with index of 3
        inventory.remove(3); // arrayList shifted and we have to pay attention what we want to remove!!!

        ArrayList<String> carsToBeRemoved = new ArrayList<>();
        carsToBeRemoved.add("Tesla");
        carsToBeRemoved.add("BMW");

        inventory.removeAll(carsToBeRemoved);











    }
}
