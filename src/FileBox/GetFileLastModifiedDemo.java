package FileBox;

import java.io.File;
import java.util.Date;

public class GetFileLastModifiedDemo {
    public static void main(String[] args) {
        File file = new File("E:/java.txt");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
