package singleton;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());
        System.out.println(Driver.getDriver());

        Driver d1 = Driver.getDriver();
        Driver d2 = Driver.getDriver();
        Driver d3 = Driver.getDriver();
        Driver d4 = Driver.getDriver();




    }
}
