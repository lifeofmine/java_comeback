package SetBox;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetMaxMinValueDemo {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println(list);
        System.out.println("最大值：" + Collections.max(list));
        System.out.println("最小值：" + Collections.min(list));
    }
}
