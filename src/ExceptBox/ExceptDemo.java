package ExceptBox;
import java.util.Arrays;

public class ExceptDemo {
    public static void main(String[] args) {
        int[] a = new int[2];
        try {
            Arrays.fill(a, 5);
            Arrays.fill(a, 0, 1, 1);
            System.out.println("Access element three:" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown:" + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
        System.out.println("Out of the block");
    }
}
