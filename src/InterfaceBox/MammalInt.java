package InterfaceBox;

public class MammalInt implements Animal {
    public void eat() {
        System.out.println("Mammal eats");
    }

    public String travel() {
        System.out.println("Mammal travels");
        return "Mammal travels String";
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
