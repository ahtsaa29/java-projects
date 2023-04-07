import javax.swing.*;
import java.awt.event.*;

// mouse adapter
public class B11 extends JFrame {

    public B11() {
        addMouseListener(new MHandler());
        setVisible(true);
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        B11 b = new B11();
    }
}

class MHandler extends MouseAdapter {
    public void mouseClicked(MouseEvent me) {
        System.out.println("mouse clicked");
    }

}