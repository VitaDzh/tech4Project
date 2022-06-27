package homeworks;

import sun.applet.resources.MsgAppletViewer;

import java.util.*;

import static java.util.Map.*;

public class Homework23 {
    /*
    Requirement:
    Write a method called as parseData() which takes a String has some keys in {} and
    values after between }{ and returns a collection that has all the keys and values
    as entries.
    NOTE: The keys should be sorted!
     */

    public static TreeMap<String, String> parseData(String str) {
        TreeMap<String, String> map = new TreeMap<>();
        String[] arr = str.replaceAll("[{}]", " ").split(" ");
        for (int i = 1; i < arr.length; i += 2) {
            map.put(arr[i], arr[i + 1]);
        }
        return map;
    }

    /*
    Requirement:
    Write a method called as calculateTotalPrice1() which takes a Map of some shopping
    items with their amounts and calculates the total prices as double. Item prices are given below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    Pineapple = $5.25
     */
    public static double calculateTotalPrice1(Map<String, Double> map, double[] prices) { // using double[] arg, which is not a part of requirements
        String[] keys = map.keySet().toArray(new String[0]);
        for (int i = 0; i < map.size(); i++) {
            map.put(keys[i], map.get(keys[i]) * prices[i]);
        }
/*
        double sum = 0;
        for (Double value : map.values().toArray(new Double[0])) {
            sum += value;
 */
        double sum = map.values().stream().mapToDouble(Double::doubleValue).sum();
        return sum;
    }


    /*Jonathan's way
    public static double calculateTotalPrice11(Map<String, Integer> grocery) {
        Map<String, Double> prices = Map.of("Apple", 2.00, "Orange", 3.29, "Mango", 4.99, "Pineapple", 5.25);
        double sum = 0.00;
        for (String key : grocery.keySet()) {
            for (int j = 0; j < grocery.get(key); j++) { // how many times u need your loop to run -> grocery.get(key)
                sum += prices.get(key);
            }
        }
        return Math.round(sum * 100.0) / 100.0;
    }

     */

    /*
    Requirement:
    Write a method calculateTotalPrice2() which takes a Map of some shopping items
    with their amounts and calculates the total prices as double. Item prices are given below
    Apple = $2.00
    Orange = $3.29
    Mango = $4.99
    BUT there will be some discounts as below
    There will be %50 discount for every second Apple
    There will be 1 free Mango if customer gets 3. So, fourth one is free.
     */
    public static double calculateTotalPrice2(Map<String, Integer> grocery) {
        Map<String, Double> prices = new LinkedHashMap<>();
        prices.put("Apple", 2.00);
        prices.put("Orange", 3.29);
        prices.put("Mango", 4.99);
        double sum = 0.00;
        for (String key : grocery.keySet()) {
            for (int i = 1; i <= grocery.get(key); i++) {
                if (key.equals("Apple")) {
                    if (i % 2 != 0) sum += prices.get(key);
                    else sum += prices.get(key) / 2;
                } else if (key.equals("Mango")) {
                    if (i % 4 != 0) sum += prices.get(key);
                } else sum += prices.get(key);
            }
        }
        return sum;
    }
















    public static void main(String[] args) {
        String str = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";
        System.out.println(parseData(str));
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("Apple", 4);
        items.put("Orange", 3);
        items.put("Mango", 8);
       // items.put("Pineapple", 5.25);

        double[] prices = {2.0, 4.99};
        //System.out.println(calculateTotalPrice1(items, prices));
        System.out.println(calculateTotalPrice2(items));

// shhh
    }

}




