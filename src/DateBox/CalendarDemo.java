package DateBox;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2018,Calendar.JULY,12);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        c.set(Calendar.MONTH, Calendar.FEBRUARY);
        System.out.println(c.get(Calendar.MONTH));
    }
}
