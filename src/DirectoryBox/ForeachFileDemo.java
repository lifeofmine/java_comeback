package DirectoryBox;

import java.io.File;

public class ForeachFileDemo {
    public static void main(String[] args) {
        File dir = new File("E:/");
        String[] children = dir.list();
        if (children == null) {
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
