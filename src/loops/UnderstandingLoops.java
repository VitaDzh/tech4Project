package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {

        /*
        Write a Java program to print “Hello” 5 times
        SYNTAX: for(start POINT; termination condition(SHOULD ALWAYS BE BOOLEAN); update){
        //Sout("Hi");
        }
         */

       for(int count = 1; count <= 5; count++){
           System.out.println("Hello");
       }
       for(int count = 10; count >= 1; count--){
           System.out.println("Hi");
       }
      /* for(int count = 10; count >=1; count++){    // Infinitive loop, which NEVER STOP EXECUTING CODE,
           System.out.println("Bye");                   it does not have a condition to stop
       }
       */
        int year = 2022;
        for(int age = 10; age <= 35; age++){
            System.out.println("Age is " + age + " in " + year);
            year++;
        }






    }
}
