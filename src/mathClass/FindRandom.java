package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        double random = Math.random(); // 0.0----0.9999
        double random0And10Included = Math.random() * 11; // if I need from 0 to 9, because 0 couts always

        //create a random number between 0 and 20 included. take it as an int

        int numbersBetween0And20Included = (int) (Math.random() * 21); // always parentesis
        System.out.println(numbersBetween0And20Included);

        // create number between 10 to 20

        int numbersBetween0And20Includedd = (int) (Math.random() * 21 + 1); // always parentesis
        System.out.println(numbersBetween0And20Includedd);
       // Math.random() * 11 //it is between 0 and 10
        // Math.random() * 11) + 10 //10-20

        // create number between 103 - 346
        //get the difference --> 346-103 = 243 and add +1
        // multiply it by 243 +1 = 244
        // add the starting point to the equation
        // random * (end point - start point + 1) + start point --> included

        int random103And246Includ = (int) (Math.random() * 244) + 103;
        System.out.println(random103And246Includ);

        // -50 to 50
        //start point is 50, end point is -50.
        int random_50And50Included = (int) (Math.random() * 101) - 50;
        System.out.println(random_50And50Included);

        



    }
}
