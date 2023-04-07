package A;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A10 {
    public A10() {
    }

    public void readFromFile() {
        // input
        System.out.println("Reading from File");
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException fne) {
            System.out.println("FIle not found");
        } catch (IOException ie) {
            System.out.println("IO Exception");

        }

    }

    public void writeToFile() {
        // output
        System.out.println("Writing to File");
        try {
            FileOutputStream fos = new FileOutputStream("abc.txt");
            String s = "Hello";
            fos.write(s.getBytes());
            fos.close();
        } catch (FileNotFoundException fe) {
            System.out.println("File not Found");
        } catch (IOException ie) {
            System.out.println("IO exception");
        }
    }

    public static void main(String[] args) {
        A10 a = new A10();
        a.writeToFile();
        a.readFromFile();
    }
}
