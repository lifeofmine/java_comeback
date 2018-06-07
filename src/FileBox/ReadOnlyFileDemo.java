package FileBox;

import java.io.File;

public class ReadOnlyFileDemo {
    public static void main(String[] args) {
        File file = new File("E:/java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
