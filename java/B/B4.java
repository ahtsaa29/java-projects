// import javax.swing.JButton;
// import javax.swing.JFrame;

// import java.awt.GridBagConstraints; 
// // import java.awt.GridBagLayout;
import javax.swing.*;
import java.awt.*;

public class B4 extends JFrame {
    JButton a1 = new JButton("a1");
    JButton a2 = new JButton("a2");
    JButton a3 = new JButton("a3");
    JButton a4 = new JButton("a4");
    JButton a5 = new JButton("a5");
    JButton a6 = new JButton("a6");

    public B4() {
        GridBagLayout bl = new GridBagLayout();
        this.getContentPane().setLayout(bl);
        add(a1, new GridBagConstraints(0, 0, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        add(a2, new GridBagConstraints(1, 0, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        add(a3, new GridBagConstraints(2, 0, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        add(a4, new GridBagConstraints(2, 1, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        add(a5, new GridBagConstraints(2, 2, 1, 1, 0.33, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        add(a6, new GridBagConstraints(0, 1, 2, 2, 0.66, 0.66, GridBagConstraints.NORTHEAST, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 0, 0));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // window size
        setSize(500, 500);
        setVisible(true);
        setTitle("Border Layout");
    }

    public static void main(String[] args) {
        B4 b4 = new B4();

    }
}