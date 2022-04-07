package oop_principles.class_objects;

public class CurvedSword {
    public CurvedSword(){

    }
    public CurvedSword(String color, String material, String sharpness, double weight, double price){
        this.color = color;
        this.material = material;
        this.sharpnes = sharpnes;
        this.weight = weight;
        this.price = price;
    }


    public String color;
    public String material;
    public static String handle = "T shape handle";
    public String sharpnes;
    public static String size = "Normal";
    public double weight;
    public double price;

    public void slash(){
        System.out.println(material + " Sword slashes");
    }

    public void cut(){
        System.out.println(material + "Sword cuts");
    }

    public void cut(boolean isSharp){
        System.out.println(isSharp ? "Sharp" : "Not sharp");
    }

    public CurvedSword(String material) {
        this.material = material;
    }

    public static CurvedSword creatingSword(String material) {
//        CurvedSword sword = new CurvedSword(material);
//        return sword;
        return new CurvedSword(material);
    }








    public static void main(String[] args) {

    CurvedSword goldenSword = new CurvedSword();
    goldenSword.color = "Yellow";
    goldenSword.material = "Gold";
    goldenSword.sharpnes = "Blunt";
    goldenSword.price = 500.0;
    goldenSword.weight = 15.5;

    CurvedSword ironSword = new CurvedSword("Silver", "Iron", "Sharp", 7.3, 50.0);


    goldenSword.slash();
    goldenSword.cut();
    goldenSword.cut(false);
        System.out.println(goldenSword.sharpnes.equals("Sharp"));


    }



}