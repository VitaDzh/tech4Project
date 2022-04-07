package myString;

public class MyStringExmp {
    public static void main(String[] args){

        String part1 = "My";
        String part2 = "Name";
        String full = part1 + " " + part2;

        String firstName = "Vita";
        String lastName = "Yuzko";
        String fullNam = firstName + " " +lastName;
        String fullNa = "Vita".concat(" " +lastName);






        System.out.println(part1 + part2); // output: MyName
        System.out.println(part1+ " " +part2); // output: My Name
        System.out.println(full);
        System.out.println("neso" + " academy" + 5 + 3); // output : neso academy53
        System.out.println("neso" + "academy" + (5+3)); //output: neso academy8(so,to calculate we need to use ())
        System.out.println("neso".concat(" academy").concat(" 5"));

        System.out.println(fullNam);




    }
}
