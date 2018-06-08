package ExceptionBox;

public class MultiCatchExceptionDemo {
    public static void main(String[] args) {
        MultiCatchDemo d = new MultiCatchDemo();

        try {
//            int x = d.div(4, 0);
            int x = d.div(5, 0);
//            int x = d.div(4, 1);
            System.out.println("x=" + x);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Over");
    }
}

class MultiCatchDemo {
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = new int[a];
        System.out.println(arr[4]);
        return a/b;
    }
}
