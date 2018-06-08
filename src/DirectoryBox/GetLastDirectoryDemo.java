package DirectoryBox;

import java.io.File;

public class GetLastDirectoryDemo {
    public static void main(String[] args) {
        File file = new File("E:/a/b");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上级目录为：" + strParentDirectory);
    }
}
