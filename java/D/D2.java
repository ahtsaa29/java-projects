// for beans -- no arguments constructor

import java.awt.*;
import java.io.Serializable;
import java.util.Random;

import javax.swing.*;

class MyCanvas extends Canvas implements Runnable, Serializable {
    private int x, y, h, w;
    private Color color;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;

    }

    public int getY() {
        return this.y;

    }

    public void setW(int w) {
        this.w = w;
    }

    public int getW() {
        return this.w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getH() {
        return this.h;
    }

    public void setColor(Color c) {
        this.color = c;
    }

    public Color getColor() {
        return this.color;
    }

    public MyCanvas() {
        this.x = 100;
        this.y = 100;
        this.h = 100;
        this.w = 100;
        this.color = Color.RED;
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

public class D2 extends JFrame {
    MyCanvas my = new MyCanvas();

    public D2() {
        getContentPane().setLayout(new GridLayout(1, 1));
        getContentPane().add(my);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        D2 d = new D2();
    }
}
