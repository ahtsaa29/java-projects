import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// mouse listener
public class B10 extends JFrame implements MouseListener {

    public B10() {
        addMouseListener(this);
        setVisible(true);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseExited(MouseEvent me) {
        System.out.println("mouse exited");
    }

    public void mouseEntered(MouseEvent me) {
        System.out.println("mouse entered");
    }

    public void mousePressed(MouseEvent me) {
        System.out.println("mouse pressed");
    }

    public void mouseReleased(MouseEvent me) {
        System.out.println("mouse released");
    }

    public void mouseClicked(MouseEvent me) {
        System.out.println("mouse clicked");
    }

    public static void main(String[] args) {
        B10 b = new B10();
    }
}
