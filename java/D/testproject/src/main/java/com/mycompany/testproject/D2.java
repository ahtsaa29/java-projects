/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testproject;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author aasthabajracharya
 */
public class D2 extends Canvas implements Runnable, Serializable {
    private int x, y, h, w;
    private Color color;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }



    public D2() {
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
