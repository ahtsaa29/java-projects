// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;

import javax.swing.*;
import java.awt.*;

class P1 extends JPanel {
    JLabel lname = new JLabel("Name");
    JLabel laddress = new JLabel("Address");
    JLabel lphone = new JLabel("Phone");
    JLabel ldetail = new JLabel("Details");

    JTextField tname = new JTextField();
    JTextField taddress = new JTextField();
    JTextField tphone = new JTextField();
    JTextArea tadetail = new JTextArea();

    public P1() {
        setLayout(new GridBagLayout());
        int c = GridBagConstraints.CENTER;
        int b = GridBagConstraints.BOTH;
        int h = GridBagConstraints.HORIZONTAL;
        Insets i = new Insets(0, 0, 0, 0);
        add(lname, new GridBagConstraints(0, 0, 1, 1, 0.2, 0.2, c, h, i, 0, 0));
        add(laddress, new GridBagConstraints(0, 1, 1, 1, 0.2, 0.2, c, h, i, 0, 0));
        add(lphone, new GridBagConstraints(0, 2, 1, 1, 0.2, 0.2, c, h, i, 0, 0));
        add(ldetail, new GridBagConstraints(0, 3, 1, 3, 0.2, 0.4, c, h, i, 0, 0));

        add(tname, new GridBagConstraints(1, 0, 1, 1, 0.8, 0.2, c, h, i, 0, 0));
        add(taddress, new GridBagConstraints(1, 1, 1, 1, 0.8, 0.2, c, h, i, 0, 0));
        add(tphone, new GridBagConstraints(1, 2, 1, 1, 0.8, 0.2, c, h, i, 0, 0));
        add(tadetail, new GridBagConstraints(1, 3, 1, 3, 0.8, 0.4, c, h, i, 0, 0));

    }
}

class P2 extends JPanel {
    JButton add = new JButton("add");
    JButton delete = new JButton("delete");
    JButton edit = new JButton("edit");
    JButton view = new JButton("view");
    JButton abc = new JButton("abc");
    JButton pqr = new JButton("pqr");

    public P2() {
        setLayout(new GridBagLayout());
        int c = GridBagConstraints.CENTER;
        int b = GridBagConstraints.BOTH;
        int h = GridBagConstraints.HORIZONTAL;
        Insets i = new Insets(0, 0, 0, 0);
        add(add, new GridBagConstraints(0, 0, 1, 1, 1, 0.16, c, b, i, 0, 0));
        add(delete, new GridBagConstraints(0, 1, 1, 1, 1, 0.16, c, b, i, 0, 0));
        add(edit, new GridBagConstraints(0, 2, 1, 1, 1, 0.16, c, b, i, 0, 0));
        add(view, new GridBagConstraints(0, 3, 1, 1, 1, 0.16, c, b, i, 0, 0));
        add(abc, new GridBagConstraints(0, 4, 1, 1, 1, 0.16, c, b, i, 0, 0));
        add(pqr, new GridBagConstraints(0, 5, 1, 1, 1, 0.16, c, b, i, 0, 0));
    }

}

class P3 extends JPanel {
    JLabel limage = new JLabel("Jlabel Image");
    JButton xyz = new JButton("xyz");
    JButton mn = new JButton("mn");

    public P3() {
        setLayout(new GridBagLayout());
        int c = GridBagConstraints.CENTER;
        int b = GridBagConstraints.BOTH;
        int h = GridBagConstraints.HORIZONTAL;
        Insets i = new Insets(0, 0, 0, 0);
        add(limage, new GridBagConstraints(0, 0, 1, 1, 1, 0.8, c, b, i, 0, 0));
        add(xyz, new GridBagConstraints(0, 1, 1, 1, 1, 0.1, c, b, i, 0, 0));
        add(mn, new GridBagConstraints(0, 2, 1, 1, 1, 0.1, c, b, i, 0, 0));

    }

}

public class B5 extends JFrame {
    P1 p1 = new P1();
    P2 p2 = new P2();
    P3 p3 = new P3();

    public B5() {
        getContentPane().setLayout(new GridBagLayout());
        int c = GridBagConstraints.CENTER;
        int b = GridBagConstraints.BOTH;
        int h = GridBagConstraints.HORIZONTAL;
        Insets i = new Insets(0, 0, 0, 0);
        getContentPane().add(p1, new GridBagConstraints(0, 0, 1, 1, 0.6, 1, c, b, i, 0, 0));
        getContentPane().add(p2, new GridBagConstraints(1, 0, 1, 1, 0.2, 1, c, b, i, 0, 0));
        getContentPane().add(p3, new GridBagConstraints(2, 0, 1, 1, 0.2, 1, c, b, i, 0, 0));
        setSize(500, 500);
        setVisible(true);
        setTitle("Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        B5 b5 = new B5();

    }
}