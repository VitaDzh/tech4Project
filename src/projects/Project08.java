package projects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Project08 {

    /*
    TASK-1 - countMultipleWords() method
    •	Write a method that takes a String[] array as an argument and counts how many strings
    in the array has multiple words
    •	This method will return an int which is the count of multiple words
    •	NOTE: be careful about these as they are not multiple words ->“”,    “   “,    “    abc”,  “abc   “
    Test data:
    [“foo”, “”, “ “, “foo bar”, “java is fun”, “ ruby ”]
    Expected output:
    2
     */
    public static int countMultipleWords(String[] arr) {
        int count = 0;
        String[] trimmed = new String[6];
        for (int i = 0; i < arr.length; i++) {
            trimmed[i] += arr[i].trim();
            if (trimmed[i].contains(" ")) count++;
        }
        return count;
    }


    /*
    TASK-2 - removeNegatives() method
    •	Write a method that takes an “ArrayList<Integer> numbers” as an argument
    and removes all negative numbers from the given list if there are any
    •	This method will return an ArrayList with removed negatives
    Test data 1:
    [2, -5, 6, 7, -10, -78, 0, 15]
    Expected output 1:
    [2, 6, 7, 0, 15]
    Test data 2:
    [2, -5, 6, 7, -10, -78, 0, 15]
    Expected output 2:
    [2, 6, 7, 0, 15]
     */
      public static ArrayList<Integer> removeNegativessWithIf(ArrayList<Integer> arrayList) {
          arrayList.removeIf(element -> element < 0);
          return arrayList;
      }

        public static ArrayList<Integer> removeNegativess(ArrayList<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element < 0) {
                iterator.remove();
            }
        }
        return arrayList;
    }

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> arrayList) {
        List<Integer> removed = new ArrayList<>();
        for (Integer integer : arrayList) {
            if(integer < 0) removed.add(integer);
        }
        arrayList.removeAll(removed);
        return arrayList;
    }

    /*
    TASK-3 - validatePassword() method
    •	Write a method that takes a “String password” as an argument and checks if the given password
    is valid or not
    •	This method will return true if given password is valid, or false if given password is not valid
    •	A VALID PASSWORD:
        -should have length of 8 to 16 (length of 7 or 17 should return false)
        -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
        -should NOT have any space
     */
    public static boolean validatePassword(String str){
        int countLow = 0, countUp = 0, countDig = 0, countSpec = 0;
         if(!str.contains(" ") && str.length() > 7 && str.length() < 17){
             for (int i = 0; i < str.length(); i++) {
                 if(Character.isLowerCase(str.charAt(i))) countLow++;
                 else if(Character.isUpperCase(str.charAt(i))) countUp++;
                 else if(Character.isDigit(str.charAt(i))) countDig++;
                 if(!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) countSpec++;
             }
        } return(countLow >=1 && countUp >= 1 && countDig >= 1 && countSpec >= 1);
    }
    /*
    if(str.contains(" ") || str.length() < 8 || str.length > 16
     */

    /*
    TASK-4 - validateEmailAddress() method
•	Write a method that takes a “String email” as an argument and checks if the
    given email is valid or not
•	This method will return true if given email is true, or false if given email
    is not valid
•	A VALID EMAIL:
	-should NOT have any space
	-should not have more than one “@” character
	-should be in the given format <2+chars>@<2+chars>.<2+chars>
     */

    public static boolean validateEmailAddress(String email){
        int countEd = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') countEd++;
        }
        if(email.contains(" ") || countEd > 1 || email.length() < 8) return false;
        String beforeEd = email.substring(0, email.indexOf('@')+1);
        String betweenEdAndDot = email.substring(email.indexOf('@')+1, email.lastIndexOf('.')+1);
        String afterDot = email.substring(email.indexOf('.'));
        return (beforeEd.length() >= 3 && betweenEdAndDot.length() >= 3 && afterDot.length() >= 3);
    }
    // v i t @ i l . com - 7
    // 0 1 2 3 4 5 6 7 8


    //Solution without regex TASK 4_Akin's
    //str.length()-1 != str.removeAll("@").length()
    public static boolean validateEmail(String str){
        if(str.contains(" ") || !str.contains("@") || !str.contains(".") || str.length() < 8 ||
                (str.indexOf("@") != str.lastIndexOf("@"))) return false;

        return str.substring(0, str.indexOf("@")).length() >= 2 &&
                str.substring(str.indexOf("@")+1, str.indexOf(".")).length() >= 2 &&
                str.substring(str.lastIndexOf(".")+1).length() >= 2;
    }




    public static void main(String[] args) {
           String[] arr = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(arr));

        String d = "   kjh  ";

        List<Integer> list = new ArrayList<>();
        list.add(-4);
        list.add(-5);
        list.add(6);
        list.add(-7);
        list.add(-10);
        list.add(-78);
        list.add(0);
        list.add(-15);
        System.out.println(removeNegatives((ArrayList<Integer>) list));
        System.out.println(removeNegativess((ArrayList<Integer>) list));
        System.out.println(removeNegativessWithIf((ArrayList<Integer>) list));

        String passWord = "Abcd123!";
        String passWord2 = "a@gmail.com";
        System.out.println(validatePassword(passWord));
        System.out.println(passWord.charAt(passWord.length()-4));
        System.out.println(validateEmailAddress(passWord2));



    }

    }

