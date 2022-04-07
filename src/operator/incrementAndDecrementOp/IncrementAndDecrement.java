package operator.incrementAndDecrementOp;

public class IncrementAndDecrement {
    public static void main(String[] args) {

       int a = 10;
        // a = a + 1;
        // a += 1;
        a++; // adding one. a = 10+1 = 11. Postincrement waiting for the next time you call the variable
        ++a; //adding one. a = 11+1 = 12. Preincrement adding immediately
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);






    }
}
