package NetWorkBox;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckRemoteFileModifiedDemo {
    public static void main(String[] args) throws Exception {
        URL u = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/feedback/stable/2.0/feedback.css");
        URLConnection uc = u.openConnection();
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("java.bmp 文件最后修改时间 ：" + sdf.format(new Date(timestamp)));
    }
}
