package ListMapBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        //first
        for (String str : list) {
            System.out.println(str);
        }

        //second
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i=0;i<strArray.length;i++) {
            System.out.println(strArray[i]);
        }

        //third
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
