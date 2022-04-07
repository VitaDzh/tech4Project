package loops;

public class Mock_preparation {
    public static void main(String[] args) {

        /* finding max and second max from an array
        int nums = {4, 5,}
        Pseudo code:
        1. Create a container
        2. find the max with the loop
        3. find the second max with the loop (if it is not the max and bigger than the rest it is second max)
         */
        int[] nums = {4, 5, 64, 356, 36, 74, 32};
        int max = Integer.MIN_VALUE;
        int secondMAx = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]) max = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != max && secondMAx < nums[i]) secondMAx = nums[i]; ;
        }
        System.out.println(max);
        System.out.println(secondMAx);


        //PALINDROME
        String word= "civic";
        String reversedPalindrome = "";
        for (int i = word.length()-1; i > 0; i--) {
            reversedPalindrome += word.charAt(i) + "";
        }
        System.out.println(reversedPalindrome.equals(word));


        /*FIZZBAZZ - (1-16 both included)
        both by 3 and 5 divided it is "fizzbazz"
        by 3 - "bazz"
        by 5 - "fizz"
        by NONE-number itself
         */
        for (int i = 1; i <= 16; i++) {
            if(i % 15 == 0) System.out.println("fizzbazz");
        }


        //Fibonacci (10 numbers to get from Fibo)
        /*
        1.store and get the number
        2.find the third
        3.change n1 and n2
         */
        int n1 = 0, n2 = 1, n3;
        String s = " ";

        for (int i = 0; i < 10; i++) {
            s += n1 + " - ";
            //get third
            n3 = n1 + n2;
            // change n1 and n2 for the next time
            n1 = n2;
            n2 = n3;
        }
        System.out.println(s.substring(0, s.length()-3)); // deleting last " - "


        String st = "I like to swim";
        String str = "";

        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if(String.valueOf(st.charAt(i)).equals(" ")) count++;
        }
        System.out.println(count);












    }
}
