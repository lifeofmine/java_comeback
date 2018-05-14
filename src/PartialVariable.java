public class PartialVariable {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是：" + age);
    }

    public static void main(String args[]) {
        PartialVariable test = new PartialVariable();
        test.pupAge();
    }
}
