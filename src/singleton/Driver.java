package singleton;

public class Driver {

    /*
    How to achieve singleton:
    1. Make constructor private
    2. Create a private instance variable of the object of Driver
    3. MAke this var static and provide a static getDriver method
    4. provide if condition to initialize the Driver instance variables
        if it is null, then initialize it
        If it is not null, then return the driver which has been already initialized

        NOTE: we understand that the single Driver object is also encapsulated
     */

    private static Driver driver;

    private Driver(){

    }

    public static Driver getDriver(){
       if(driver == null) driver = new Driver();
        return driver;
    }



}
