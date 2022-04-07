package arrays;

import java.util.Arrays;

public class TwoDimentionalArrays {
    public static void main(String[] args) {

        String[][] studentGroups = {
                                    {"Kaly", "Guluzar", "Melda"},
                                    {"Torrie", "David"},
                                    {"Abe", "Data"}
                                    };
        System.out.println(studentGroups[0][1]);
        System.out.println(studentGroups[1][0]);
        System.out.println(studentGroups[1][1]);

        //How to get the size of the studentGroups
        System.out.println(studentGroups.length);
        System.out.println(studentGroups[1].length);

        //How to print the third group
        System.out.println(Arrays.toString(studentGroups[2]));

        //How to print all
        System.out.println(Arrays.deepToString(studentGroups));

        //How to print each group in separate lines
        for (int i = 0; i < studentGroups.length; i++) {
            System.out.println(Arrays.toString(studentGroups[i]));
        }
        for (String[] groups: studentGroups) {
            System.out.println(Arrays.toString(groups));
        }
        // How to print each group member in separate lines
        for (int i = 0; i < studentGroups.length; i++) {
            for (int j = 0; j < studentGroups[i].length; j++) { // after my inner loop is terminated, it will go again to outer loop
                System.out.println(studentGroups[i][j]);
            }
        }
        for (String[] group: studentGroups) {
            for (String member: group) {
                System.out.println(member);
            }
        }





    }
}
