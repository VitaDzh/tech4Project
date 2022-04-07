package loops.forLoop;

public class PrintEachCharFromString {
    public static void main(String[] args) {
        /*
        Write a Java program to print each character
        of given String in a separate line:
	    String str = “TechGlobal School”;
         */
        String str = "TechGlobal School";
        for(int i = 0; i <= str.length()-1; i++){
            System.out.print(str.charAt(i));
        }




    }
}
