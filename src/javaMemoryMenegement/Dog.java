package javaMemoryMenegement;

public class Dog {

    public String breed;
    public int age;


    @Override
    protected void finalize(){
        System.out.println("A dog object is garbage collected");
    }
}
