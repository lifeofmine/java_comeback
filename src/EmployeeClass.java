import java.io.*;
public class EmployeeClass {
    private static double salary;
    public static final String DEPARTMENT = "开发人员";
    public static void main(String args[]) {
        salary = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+(int)salary);
    }
}
