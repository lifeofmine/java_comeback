package GenericsBox;

public class GenericClassDemo<T> {
    private T t;
    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericClassDemo<Integer> integerBox = new GenericClassDemo<Integer>();
        GenericClassDemo<String> stringBox = new GenericClassDemo<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("菜鸟教程"));

        System.out.printf("整型值：%d\n\n", integerBox.get());
        System.out.printf("字符串为：%s\n", stringBox.get());
    }
}
