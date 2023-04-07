import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// implementing listeners
public class B7 extends JFrame implements ActionListener {
    JButton j1 = new JButton("b1");

    public void actionPerformed(ActionEvent taking) {
        System.out.println("clicked");
    }

    public B7() {
        setLayout(new GridLayout(1, 1));
        this.add(j1);
        j1.addActionListener(this); // event registration
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        B7 b7 = new B7();

    }
}
