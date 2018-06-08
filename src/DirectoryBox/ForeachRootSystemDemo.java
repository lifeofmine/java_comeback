package DirectoryBox;

import java.io.File;

public class ForeachRootSystemDemo {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println("系统所有根目录：");
        for (int i = 0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
    }
}
