import java.applet.*;
import java.awt.*;

//appletviewer TestPage.html

public class TestApplet extends Applet {
	String s;

	public TestApplet() {

	}

	public void init() {
		System.out.println("init..");
	}

	public void start() {
		System.out.println("start..");
		s = "Hello Applet....";
	}

	public void paint(Graphics g) {
		System.out.println("paint..");

		g.setColor(Color.red);
		g.fillRect(100, 100, 100, 100);

		g.drawString(s, 400, 400);

	}

	public void stop() {
		System.out.println("stop..");
	}

	public void destroy() {
		System.out.println("destroy..");
	}
}