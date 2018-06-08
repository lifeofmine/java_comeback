package DirectoryBox;

import java.io.File;

public class IsNullDirectoryDemo {
    public static void main(String[] args) {
        File file = new File("E:\\a");
        if (file.isDirectory()) {
            if (file.list().length > 0) {
                System.out.println("目录不为空");
            } else {
                System.out.println("目录为空！");
            }
        } else {
            System.out.println("这不是一个目录！");
        }
    }
}
