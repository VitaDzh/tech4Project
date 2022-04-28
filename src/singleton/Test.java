package singleton;

public class Test {
    public static void main(String[] args) {
        /*
        Driver d1 = new Driver();
        Driver d2 = new Driver();

        System.out.println(d1);
        System.out.println(d2);

         */

        System.out.println(Driver.getDriver());//Object 1
        System.out.println(Driver.getDriver()); // Object2

    }
}
