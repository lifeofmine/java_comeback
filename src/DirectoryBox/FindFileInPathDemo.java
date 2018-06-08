package DirectoryBox;

import java.io.File;
import java.io.FilenameFilter;

public class FindFileInPathDemo {
    public static void main(String[] args) {
        File dir = new File("E:/");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("a");
            }
        };
        String[] children1 = dir.list(filter);
        if (children1 == null) {
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (int i = 0; i < children1.length; i++) {
                String filename = children1[i];
                System.out.println(filename);
            }
        }
    }
}
