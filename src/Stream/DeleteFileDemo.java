package Stream;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String args[]) {
        File folder = new File("E:/tmp");
        deleteFolder(folder);
    }

    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f: files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
