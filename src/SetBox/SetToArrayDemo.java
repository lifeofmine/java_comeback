package SetBox;

import java.util.ArrayList;
import java.util.List;

public class SetToArrayDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("网");
        list.add("络");
        list.add("www.runoob.com");
        String[] s1 = list.toArray(new String[0]);
        for (int i = 0; i < s1.length; ++i) {
            String contents = s1[i];
            System.out.print(contents);
        }
    }
}
