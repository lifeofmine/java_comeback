package DirectoryBox;

import java.io.File;

public class RecursiveDirectoryDemo {
    public static void main(String[] args) {
        String directories = "E:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}
