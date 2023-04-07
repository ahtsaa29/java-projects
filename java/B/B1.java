import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
// import javax.swing.*;
// import javax.awt.*;

public class B1 extends JFrame {
    JButton a1 = new JButton("a1");
    JButton a2 = new JButton("a2");
    JButton a3 = new JButton("a3");
    JButton a4 = new JButton("a4");
    JButton a5 = new JButton("a5");

    public B1() {
        FlowLayout fl = new FlowLayout();
        this.getContentPane().setLayout(fl);
        add(a1);
        add(a2);
        add(a3);
        add(a4);
        add(a5);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // window size
        setSize(500, 500);
        setVisible(true);
        setTitle("Flow Layout");
    }

    public static void main(String[] args) {
        B1 b1 = new B1();

    }
}