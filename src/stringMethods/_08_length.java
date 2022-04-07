package stringMethods;

import utilities.CharacterHelper;

public class _08_length {
    public static void main(String[] args) {
        /*
        8.	length()
-	count the total number of the characters in the String and return it as an int
-	non-static, called with an Object name
-	returns int(total number of the characters)
-	does not take any arguments
-	it starts count from 1
         */
        String city = "Chicago";

        System.out.println(city.length()); // 7
        System.out.println(city.length() + 3); // 10

        String company = "TechGlobal";
        int size = company.length(); // 10 since it returns int we can store in int
        System.out.println(size); // 10
        System.out.println(company.length()-1);



    }
}
