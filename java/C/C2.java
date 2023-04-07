// client

import java.io.*;
import java.net.*;

class Message implements Serializable {
    String message;
    String username;

    public Message() {
    }

    public Message(String message, String username) {
        this.message = message;
        this.username = username;
    }

    public void printData() {
        System.out.println("message: " + message);
        System.out.println("username: " + username);
    }

}

public class C2 {
    ObjectOutputStream oos;
    Socket socket;

    public C2() {

    }

    public void sendData() {
        System.out.println("Writing to network");
        try {
            socket = new Socket("192.168.0.114", 7000);
            oos = new ObjectOutputStream(socket.getOutputStream());
            Message m = new Message("hello world", "ahtsaa29");
            oos.writeObject(m);
            oos.close();
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {
        C2 a1 = new C2();
        try {
            a1.sendData();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
