package DateFormatBox;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeStampDemo {
    public static void main(String[] args) {
        Long timeStamp = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println(sd);
    }
}
