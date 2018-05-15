package DateBox;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String months[] = {
        "Jan", "Feb", "Mar", "Apr",
        "May", "Jun", "Jul", "Aug",
        "Sep", "Oct", "Nov", "Dec"};

        int year;
        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.println("Date: ");
        System.out.println(months[gcalendar.get(Calendar.MONTH)]);
        System.out.println(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.println("Time: ");
        System.out.println(gcalendar.get(Calendar.HOUR) + ":");
        System.out.println(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        if(gcalendar.isLeapYear(year)) {
            System.out.println("当前年份是闰年");
        } else {
            System.out.println("当前年份不是闰年");
        }
    }
}
