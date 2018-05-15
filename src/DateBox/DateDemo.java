package DateBox;
import java.util.Date;

public class DateDemo {
    public static void main(String args[]) {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date);
        System.out.println(date.hashCode());
        Date dateDemo = new Date(12);
        System.out.println(date.after(dateDemo));
        System.out.println(date.before(dateDemo));
        System.out.println(date.compareTo(dateDemo));
        System.out.println(date.equals(dateDemo));
        long time = date.getTime();
        System.out.println(time);
    }
}
