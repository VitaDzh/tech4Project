package stringMethods;

public class _09_trim {
    public static void main(String[] args) {
      /*
9.	trim()
-	to get rid of whitespaces from beginning and the end
-	non-static, we call it with Object name
-	returns String
-	does not take any args
-	does not get rid of middle spaces

       */
        String str = "     Hello World   ";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.trim().length());

        String str2 = "   Good     morning     ";
        String str3 = str2.trim();
        System.out.println(str3);



    }





}
