package oop_principles.class_objects;

public class Car {
    //Default constractor
    public Car(){

    }

    //Declaring attributes or field of Car
    public String make;
    public String model;
    public int year;
    public String color;
    public boolean hasSunRoof;

    //Override tooString() method that comes from Object class
    //Overriding is implementing another body for the parent method

    public void drives(){
        System.out.println("This car Drives");
    }

    public void honks(){
        System.out.println("This car honks");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", hasSunRoof=" + hasSunRoof +
                '}';


    }
}



