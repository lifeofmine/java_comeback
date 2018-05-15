package DateBox;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParse {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "2018-11-11" : args[0];
        System.out.println(input + " Parses as ");
        Date t;

        try {
            t = ft.parse(input);
            System.out.println(t);
            System.out.println(t.getTime());
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }
}
