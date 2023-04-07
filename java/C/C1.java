
// server
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;
// import java.net.ServerSocket;
// import java.net.Socket;
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

class C1 extends Thread {
    // port open
    ServerSocket ss;
    ObjectInputStream ois;
    // connect accept
    Socket socket;

    public C1() {
        try {
            ss = new ServerSocket(7000);

        } catch (Exception e) {
        }
    }

    public void run() {
        System.out.println("Reading from network");
        while (true) {
            try {
                socket = ss.accept();
                ois = new ObjectInputStream(socket.getInputStream());
                Message m = (Message) ois.readObject();
                m.printData();
                ois.close();
            } catch (Exception e) {
            }
        }

    }

    public static void main(String[] args) {
        C1 a1 = new C1();
        try {
            a1.start();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
