package operator.incrementAndDecrementOp;

public class Exercise1 {
    public static void main(String[] args) {

        int i = 5;

        int age = 10 * i++; //10 * 5
        System.out.println(age); // 50

        age = 10 * i; // 10 * 6
        System.out.println(age); // 60

        age = 10 * ++i;
        System.out.println(age); // 70

        age = 10 * i++;
        System.out.println(age); // 70

        age = 10 * i;
        System.out.println(age); // 80

        age = 10 * ++i;
        System.out.println(age); // 90

        age = 10 * i++; // i
        System.out.println(age); // 90

        age = 10 * ++i;
        System.out.println(age); // 110

        int num = 2;
        ++num;//3
        System.out.println(num); //3

        ++num;//4
        System.out.println(num);//4

        num++;//4
        System.out.println(num); //5

        num++;//5
        System.out.println(num); //6

        num++;//6
        System.out.println(num); //7

        num = num;
        System.out.println(num); //7

        num = num++;
        System.out.println(num); //7

        num = ++num;
        System.out.println(num); // 8

    }
}




