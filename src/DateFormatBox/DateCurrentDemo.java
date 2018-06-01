package DateFormatBox;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCurrentDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        Date date = new Date();
        System.out.println("现在时间：" + sdf.format(date));
    }
}
