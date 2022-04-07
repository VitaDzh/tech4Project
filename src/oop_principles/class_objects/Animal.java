package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    //default constractor
    public Animal() {

    }


    public Animal(String name, int age, String color, boolean isHerbivore, boolean isCarnivore, boolean isOmnivore){
//We should assign these local variables into instance variables
        this.name = name; // !!!!!this!!!!! keyword shows that name(instance variable) = name(local variable)
        this.age = age;
        this.color = color;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore; // this - current object refference
    } 

    //Fields of an Animal instance
    public static final boolean hasEyes = true; // it is a final instance variable. can only be true. no changes allowed
    //it is static. this value true belongs to all Animal class! That's why static. We do nto need to create an Object, just call it using class name Animal
    //if it is non-static. it means instance variable belongs to Object. So to invoke it u have to create an Object first to be able to call it
    public String name;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

/*
    @Override
    public String toString() {            //hasEyes is not here, because it does not belongs to Object, but class
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }
 */


    @Override
    public String toString() {
        String s = "Animal{";
        if(this.name != null) s +=   "name='" + this.name + '\'';
        if(this.color != null) s += ", color='" + this.color + '\'';
        if(this.age != 0) s +=  ", age=" + this.age;
        if(this.isCarnivore) s += ", isCarnivore=" + this.isCarnivore;
        if(this.isHerbivore) s += ", isHerbivore=" + this.isHerbivore;
        if(this.isOmnivore) s += ", isOmnivore=" + this.isOmnivore;
        s += '}';
        return s;
    }

    //Creating another 2 args custom constructor
    public Animal(String name, String color){
        this.name = name;
        this.color = color;

    }









    public static <cow> void main(String[] args) {
        Animal a = new Animal();
        //a1.hasEyes = false;  //reassigned . we can not do this, cause it is not final
        System.out.println(a.hasEyes);

        /*
        Create an Animal object a1 and define it's info as below:
         */
        Animal a1 = new Animal("Cow", 3, "Black", true, false, false);
      /*  a1.name = "Cow";
        a1.age = 3;
        a1.color = "Black";
       */
        System.out.println(a1);

        Animal a2 = new Animal("Cat", 1, "Grey", false, false, true);
        System.out.println(a2);

        Animal a3 = new Animal("Cat", "Blue"); // default values gonna be there
        System.out.println(a3);

        Animal a4 = new Animal("Parrot", 2, "White", true,false,false);
        System.out.println(a4);

        Animal a5 = new Animal("Lion", 4, "Beige", false, true, false);
        System.out.println(a5);

        List<Animal> animalss = new ArrayList<>();
        animalss.add(a1);
        animalss.add(a2);
        animalss.add(a3);
        animalss.add(a4);
        animalss.add(a5);
        System.out.println(animalss);

        int omni = 0, carni = 0, herb = 0;
        for (Animal animal : animalss) {
            if(animal.isOmnivore) omni++;
            else if(animal.isHerbivore) herb++;
            else carni++;
        }
        System.out.println("Herbivore " + herb);
        System.out.println("Carnivore " + carni);
        System.out.println("Omnivore " + omni);

        int herbi = (int) animalss.stream().filter(animal -> animal.isHerbivore).count(); // it's not a method but super useful. .count() returns long, that;s why we need to cast


    }
}



