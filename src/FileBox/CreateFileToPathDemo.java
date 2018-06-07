package FileBox;

import java.io.File;

public class CreateFileToPathDemo {
    public static void main(String[] args) throws Exception {
        File file = null;
        File dir = new File("E:/");
        file = File.createTempFile("JavaTemp", ".javatemp", dir);
        System.out.println(file.getPath());
    }
}
