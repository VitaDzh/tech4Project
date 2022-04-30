package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        // MM/dd/yyyy - month are always upper case
        // mm - for minutes
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy ");
        System.out.println("Today is = " + sdf.format(currentDate));


        //Print the date in the format of Sat hh:mm PM
        sdf = new SimpleDateFormat("E hh:mm a");
        System.out.println(sdf.format(currentDate));

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate));
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate));
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(currentDate));






    }
}
