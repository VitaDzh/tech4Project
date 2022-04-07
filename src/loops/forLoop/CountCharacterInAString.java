package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {

        /*
        Write a Java program to count total number
        of “o” letter in the given String below:
	    String str = “TechGlobal School”;
         */
        String str = "TechGlobal School"; // program checkes for 'o', going through the whole length of String, checking each letter,
                                          // if it is true it will count adding 1, found another count again
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'o') count++;
        }
        System.out.println(count);




    }
}
