package ExceptBox;

import java.rmi.RemoteException;

public class ThrowExceptDemo {
    public static void main(String[] args) {
        ThrowExceptDemo x = new ThrowExceptDemo();
        try {
            x.deposit(11.1);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public void deposit(double amount) throws RemoteException {
        throw new RemoteException();
    }
}
