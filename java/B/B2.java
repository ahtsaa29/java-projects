import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
// import javax.swing.*;
// import javax.awt.*;

public class B2 extends JFrame {
    JButton a1 = new JButton("a1");
    JButton a2 = new JButton("a2");
    JButton a3 = new JButton("a3");
    JButton a4 = new JButton("a4");
    JButton a5 = new JButton("a5");
    JButton a6 = new JButton("a6");

    public B2() {
        GridLayout gl = new GridLayout(1, 6);
        this.getContentPane().setLayout(gl);
        add(a1);
        add(a2);
        add(a3);
        add(a4);
        add(a5);
        add(a6);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // window size
        setSize(500, 500);
        setVisible(true);
        setTitle("Grid Layout");
    }

    public static void main(String[] args) {
        B2 b2 = new B2();

    }
}