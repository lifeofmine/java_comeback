package NetWorkBox;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class CheckoutPortDemo {
    public static void main(String[] args) {
        Socket Skt;
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 0; i < 1024; i++) {
            try {
                System.out.println("查看 " + i);
                Skt = new Socket(host, i);
                System.out.println("端口 " + i + " 已被使用");
            } catch (UnknownHostException e) {
                System.out.println("Exception occured" + e);
                break;
            } catch (IOException e) {

            }
        }
    }
}
