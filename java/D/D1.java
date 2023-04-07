import java.awt.*;
import java.util.Random;

import javax.swing.*;

class MyCanvas extends Canvas implements Runnable {
    int x, y, h, w;
    Color color;

    public MyCanvas() {
    }

    public MyCanvas(int x, int y, int h, int w, Color color) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.color = color;
        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, w, h);
    }

    public void run() {
        Random r = new Random();
        while (true) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            x = r.nextInt(200);
            y = r.nextInt(200);
            repaint();
        }
    }

}

public class D1 extends JFrame {
    MyCanvas my = new MyCanvas(100, 200, 20, 20, Color.BLUE);
    MyCanvas xy = new MyCanvas(100, 200, 20, 20, Color.RED);

    public D1() {
        getContentPane().setLayout(new GridLayout(1, 1));
        getContentPane().add(my);
        getContentPane().add(xy);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        D1 d = new D1();
    }
}
