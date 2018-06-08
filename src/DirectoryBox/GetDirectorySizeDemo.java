package DirectoryBox;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class GetDirectorySizeDemo {
    public static void main(String[] args) {
        long size = FileUtils.sizeOfDirectory(new File("E:/a"));
        System.out.println("Size: " + size + " bytes");
    }
}
