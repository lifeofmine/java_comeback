package FileBox;

import java.io.File;

public class ReNameFileDemo {
    public static void main(String[] args) {
        File oldName = new File("E:/myjavafile.txt");
        File newName = new File("E:/java.txt");
        if (oldName.renameTo(newName)) {
            System.out.println("已重命名");
        } else {
            System.out.println("Error");
        }
    }
}
