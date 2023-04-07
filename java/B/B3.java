import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
// import javax.swing.*;
// import javax.awt.*;

public class B3 extends JFrame {
    JButton a1 = new JButton("a1");
    JButton a2 = new JButton("a2");
    JButton a3 = new JButton("a3");
    JButton a4 = new JButton("a4");
    JButton a5 = new JButton("a5");

    public B3() {
        BorderLayout bl = new BorderLayout();
        this.getContentPane().setLayout(bl);
        add(a1, BorderLayout.NORTH);
        add(a2, BorderLayout.EAST);
        add(a3, BorderLayout.SOUTH);
        add(a4, BorderLayout.WEST);
        add(a5, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // window size
        setSize(500, 500);
        setVisible(true);
        setTitle("Border Layout");
    }

    public static void main(String[] args) {
        B3 b3 = new B3();

    }
}