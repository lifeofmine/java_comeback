package OverridingBox;

public class OverridingFindareasDemo {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Figure figure;
        figure = f;
        System.out.println("Area is :" + figure.area());
        figure = r;
        System.out.println("Area is :" + figure.area());
    }
}
class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    Double area() {
        System.out.println("Inside area for figure.");
        return (dim1*dim2);
    }
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    Double area() {
        System.out.println("Inside area for rectangle.");
        return (dim1*dim2);
    }
}
