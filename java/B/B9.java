import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class B9 extends JFrame implements ActionListener {
    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");

    public B9() {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(b1);
        getContentPane().add(b2);
        // action register
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
    }

    public static void main(String[] args) {
        B9 b = new B9();
    }
}
