package mathClass;

public class FindMax {
    public static void main(String[] args) {

        int x = 8;
        int y = 20;
        int z = 6;

        int maxValueOfXY = Math.max(x, y); // this can take only 2 values
        System.out.println(maxValueOfXY);
        int maxValue = Math.max('a' , y); // it will convert 'a'(it is a char) to ASCII table and add y value

        int maxValueOfXYZ = Math.max(maxValueOfXY, z); //that's how we can find max from 3 values




    }
}
