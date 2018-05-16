package Stream;

import java.io.File;

public class CreateDirDemo {
    public static void main(String[] args) {
        String dirname = "E:/tmp/user/java/bin";
        File d = new File(dirname);
        boolean r = d.mkdirs();
        System.out.println(r);
    }
}
