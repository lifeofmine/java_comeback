package ExceptBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MatiExceptDemo {
    public static void main(String[] args) {
        try {
            String fileName = "E:/test.txt";
            InputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (RuntimeException f) {
            f.printStackTrace();
        }
    }
}
