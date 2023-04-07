import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class B12 extends JFrame {
    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");
    JButton b3 = new JButton("b3");
    JTextField tf = new JTextField();

    // controller instance
    Controller c = new Controller(this);

    public B12() {
        getContentPane().setLayout(new GridLayout(2, 2));
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(tf);
        getContentPane().add(b3);
        // action register
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        });
        b3.addActionListener(c);
        setVisible(true);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public DataModel getDataModel() {
        DataModel dm = new DataModel();
        dm.name = tf.getText();
        return dm;
    }

    public static void main(String[] args) {
        B12 b = new B12();
    }
}

// model
class DataModel {
    public String name;

    public DataModel() {
    }

    public DataModel(String name) {
        this.name = name;

    }
}

// controller
class Controller implements ActionListener {
    B12 b;

    public Controller() {
    }

    public Controller(B12 b) {
        this.b = b;

    }

    public void actionPerformed(ActionEvent e) {
        DataModel m = this.b.getDataModel();
        // System.out.println(e.getActionCommand());
        // System.out.println(m.name);
        // dialogue
        JOptionPane.showMessageDialog(this.b, m.name);
    }

}