package FileBox;

import java.io.File;

public class ExistFileDemo {
    public static void main(String[] args) {
        File file = new File("E:/java.txt");
        System.out.println(file.exists());
    }
}
