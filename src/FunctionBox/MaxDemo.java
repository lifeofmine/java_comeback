package FunctionBox;

public class MaxDemo {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = MaxDemo.max(i, j);
        System.out.println(i + " 和 " + j + " 比较，最大值是："+ k);
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }

        return result;
    }
}
