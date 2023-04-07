import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class B8 extends JFrame {
    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");

    public B8() {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(b1);
        getContentPane().add(b2);
        BHandler BH = new BHandler();
        // action register
        b1.addActionListener(BH);
        b2.addActionListener(BH);
        setVisible(true);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        B8 b = new B8();
    }
}

class BHandler implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
    }
}
