package FileBox;

import java.io.File;

public class CompareFilePathDemo {
    public static void main(String[] args) {
        File file1 = new File("E:/java.txt");
        File file2 = new File("E:/javaworkspace/test.log");
        if (file1.compareTo(file2) == 0) {
            System.out.println("文件路径一致！");
        } else {
            System.out.println("文件路径不一致！");
        }
    }
}
