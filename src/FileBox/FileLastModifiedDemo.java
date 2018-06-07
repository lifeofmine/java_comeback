package FileBox;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class FileLastModifiedDemo {
    public static void main(String[] args) throws Exception {
        File fileToChange = new File("E:/myjavafile.txt");
        fileToChange.createNewFile();
       /* FileWriter fileName = new FileWriter(fileToChange.getAbsolutePath(), true);
        BufferedWriter out = new BufferedWriter(fileName);
        out.write("hello");
        out.close();*/
        Date fileTime = new Date(fileToChange.lastModified());
        System.out.println(fileTime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        fileTime = new Date(fileToChange.lastModified());
        System.out.println(fileTime.toString());
    }
}
