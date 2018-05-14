package StringBox;

public class StringBuffer {
    public static void main(String args[]) {
        java.lang.StringBuffer sBuffer = new java.lang.StringBuffer("java教程官网");
        sBuffer.append("www");
        sBuffer.append(".java");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        System.out.println(sBuffer.reverse());
        sBuffer.delete(1, 5);
        System.out.println(sBuffer);
        sBuffer.insert(5, "yes");
        System.out.println(sBuffer);
        sBuffer.replace(0, 5, "yes");
        System.out.println(sBuffer);
    }
}
