import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class B1_1 extends JFrame {
    JButton a1 = new JButton("A1");
    JButton a2 = new JButton("A2");
    JButton a3 = new JButton("A3");
    JButton a4 = new JButton("A4");
    JButton a5 = new JButton("A5");
    JButton a6 = new JButton("A6");
    JButton a7 = new JButton("A7");

    public B1_1() {
        GridBagLayout fl = new GridBagLayout();
        this.getContentPane().setLayout(fl);
        this.add(a1, new GridBagConstraints(0, 0, 1, 1, 0.25, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        this.add(a2, new GridBagConstraints(1, 0, 1, 1, 0.25, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        this.add(a3, new GridBagConstraints(2, 0, 2, 1, 0.5, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        this.add(a4, new GridBagConstraints(0, 1, 2, 2, 0.5, 0.66, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        this.add(a5, new GridBagConstraints(2, 1, 1, 2, 0.25, 0.66, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        this.add(a6, new GridBagConstraints(3, 1, 1, 1, 0.25, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        this.add(a7, new GridBagConstraints(3, 2, 1, 1, 0.25, 0.33, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

    }

    public static void main(String[] args) {
        B1_1 b = new B1_1();

    }
}
