package myString;

public class PrintOutPractice {

    public static void main(String[] args){

        String studentName = "Kaly";
        System.out.println(studentName + " is sleeping.\n"+
                studentName + " is coding.\n\t" +
                studentName + " is eating.");

        char capH = 'H';
        char e = 'e';
        char l = 'l';
        char o = 'o';

        System.out.println("" +capH + e + l + l + o); // it is a String, because u put "" in the beginning and Java read code from left to right. 
        System.out.println(capH + e + l + l + o); //72 + 101 + 108 + 108 + 111 =500
        int valueOfCapH = 'H';
        int capHNumber = 72;

        System.out.println("valueOfCapH = " + valueOfCapH);
        System.out.println("capHNumber = " + capHNumber);
        System.out.println("capH" + capH);






    }
}
