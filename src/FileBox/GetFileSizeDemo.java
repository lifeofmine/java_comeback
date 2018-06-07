package FileBox;

import java.io.File;

public class GetFileSizeDemo {
    public static long getFileSize(String fileName) {
        File file = new File(fileName);
        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在");
            return -1;
        }
        return file.length();
    }
    public static void main(String[] args) {
        long size = getFileSize("E:/myjavafile.txt");
        System.out.println("java.txt文件大小为：" + size);
    }
}
