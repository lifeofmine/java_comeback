package ExampleArray;

import java.util.ArrayList;

public class ContainsArray {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        objArray.add(2, "notcommon2");
        System.out.println("array1 的元素" + objArray);
        System.out.println("array2 的元素" + objArray2);
        System.out.println("objArray 是否包含字符串common2? ："
        + objArray.contains("common2"));
        System.out.println("objArray2 是否包含数组 objArray? ："
        + objArray2.contains(objArray));
    }
}
