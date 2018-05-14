import java.io.*;
public class EmployeeNew {
    public String name;
    private double salary;

    public EmployeeNew(String empName) {
        name = empName;
    }

    public void setSalary(double empSal) {
        salary = empSal;
    }

    public void printEmp() {
        System.out.println("名字："+name);
        System.out.println("薪水："+salary);
    }

    public static void main(String[] args) {
        EmployeeNew empOne = new EmployeeNew("RUNOOB");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
