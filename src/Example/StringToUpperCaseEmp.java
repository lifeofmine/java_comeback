package Example;

public class StringToUpperCaseEmp {
    public static void main(String[] args) {
        String str = "string runoob";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串：" + str);
        System.out.println("转换为大写：" + strUpper);

        lowerCase(strUpper);
    }

    public static void lowerCase(String str) {
        String strLower = str.toLowerCase();
        System.out.println("原始字符串：" + str);
        System.out.println("转换为小写：" + strLower);
    }
}
