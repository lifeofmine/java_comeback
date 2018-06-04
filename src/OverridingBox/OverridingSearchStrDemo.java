package OverridingBox;

public class OverridingSearchStrDemo {
    public static void main(String[] args) {
        StringBuffer searchstr = new StringBuffer("hello how are you.");
        int length = searchstr.length();
        int count = 0;
        for (int i = 0;i < length; i++) {
            if (searchstr.charAt(i) != 'h')
                continue;
            count++;
            searchstr.setCharAt(i, 'h');
        }
        System.out.println("发现 " + count + " 个 h 字符");
        System.out.println(searchstr);
    }
}
