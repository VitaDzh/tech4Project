package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {

        String n1 = "23";
        String n2 = "12";

        // 23+12 = 35
        System.out.println(n1 + n2);// output gonna be 2312

        int num1Int = Integer.parseInt(n1);
        int num2Int = Integer.parseInt(n2);
        System.out.println(num1Int + num2Int); // output gonna be 35

        //Integer is a class representation of int
        Integer nu1 = Integer.valueOf(n1);
        Integer nu2 = Integer.valueOf(n2);
        System.out.println(nu1 + nu2); // output 35







    }
}
