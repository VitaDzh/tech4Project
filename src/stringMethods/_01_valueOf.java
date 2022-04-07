package stringMethods;

public class _01_valueOf {
    public static void main(String[] args) {
        /*
	valueOf()
-	converting given variable to String: String str = String.valueOf(num);
-	static, because we call it with a class name
-	return type, returns String
-	it takes different arguments, it is an overloaded method and coverts given args to a String

         */
        String mine = "Antrolopogie";
        System.out.println("Middle 2 chars " + mine.charAt(mine.length() / 2-1) + mine.charAt((mine.length()/2-1)+1));
        System.out.println(mine.substring(0, 3));
        System.out.println(mine.substring(mine.length()-3));
        System.out.println(mine.substring(0, 2).equals(mine.substring(mine.length()-3))) ;



    }
}
