package enums;

public class TraversingEnums {
    public static void main(String[] args) {

        for(Day day : Day.values()){
            System.out.println(day);
        }

        for (Constans.Month month : Constans.Month.values()){
            System.out.println(month);
        }


    }
}
