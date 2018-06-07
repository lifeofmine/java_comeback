package FileBox;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CreateTempFileDemo {
    public static void main(String[] args) throws Exception{
        //version 1.0
        /*File temp = File.createTempFile("testrunoobtmp", ".txt");
        System.out.println("文件路径：" + temp.getAbsolutePath());
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        System.out.println("临时文件已创建：");
        out.close();*/
        //version 2.0
        File f = null;

        try {
            f = File.createTempFile("tmp", ".txt", new File("D:/"));
            System.out.println("File path: " + f.getAbsolutePath());
            f.deleteOnExit();
            f = File.createTempFile("tmp", null, new File("E:/"));
            System.out.print("File path: " + f.getAbsolutePath());
            f.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
