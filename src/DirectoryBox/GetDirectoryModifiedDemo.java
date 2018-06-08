package DirectoryBox;

import java.io.File;
import java.util.Date;

public class GetDirectoryModifiedDemo {
    public static void main(String[] args) {
        File file = new File("E:/a");
        System.out.println("最后修改时间：" + new Date(file.lastModified()));
    }
}
