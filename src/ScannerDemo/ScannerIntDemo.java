package ScannerDemo;

import java.util.Scanner;

public class ScannerIntDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            i = scan.nextInt();
            System.out.println("整数数据：" + i);
        } else {
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            f = scan.nextFloat();
            System.out.println("小数数据：" + f);
        } else {
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }
}
