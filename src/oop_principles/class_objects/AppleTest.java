package oop_principles.class_objects;

import java.util.Arrays;

public class AppleTest {
    public static void main(String[] args) {
     Apple apple1 = new Apple();
        System.out.println(apple1); // location
        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;
        System.out.println();

        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);

        Apple apple2 = new Apple();
        System.out.println(apple2); // location for apple2

        apple2.color = "Green";
        apple2.taste = "Sour";
        apple2.price = 12.90;

        System.out.println(apple2.color);
        System.out.println(apple2.taste);
        System.out.println(apple2.price);





    }
}
