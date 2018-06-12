package NetWorkBox;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ResponseHeaderInfoDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.runoob.com");
        URLConnection conn = url.openConnection();
        Map headers = conn.getHeaderFields();
        Iterator iterator = headers.keySet().iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str + " ");
        }
        Set<String> keys = headers.keySet();
        for (String key : keys) {
            String val = conn.getHeaderField(key);
            System.out.println(key + "     " + val);
        }
        System.out.println(conn.getLastModified());
    }
}
