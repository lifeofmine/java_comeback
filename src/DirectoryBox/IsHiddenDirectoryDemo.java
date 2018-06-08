package DirectoryBox;

import java.io.File;

public class IsHiddenDirectoryDemo {
    public static void main(String[] args) {
        File file = new File("E:/myfile.txt");
        System.out.println(file.isHidden());
    }
}
