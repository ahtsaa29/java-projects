/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testproject;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author aasthabajracharya
 */


public class D1 extends Canvas implements Runnable {
    int x, y, h, w;
    Color color;

    public D1() {
    }

    public D1(int x, int y, int h, int w, Color color) {
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

