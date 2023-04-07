package A;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// serailizer error because not converting to bytes
// serializer ( obj => bytes)
// deserializer ( bytes => obj) so implements serailizable

class Student implements Serializable {
    String name;
    int roll;
    // does not convert password to sequence of bytes
    transient String password;

    public Student() {
    }

    public Student(String name, int roll, String password) {
        this.name = name;
        this.roll = roll;
        this.password = password;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Password: " + password);
    }

}

public class A13 {
    public A13() {
    }

    public void readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        System.out.println("Reading");
        FileInputStream fis = new FileInputStream("pqr.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = (Student) ois.readObject();
        s.printData();
        fis.close();
    }

    public void writeToFile() throws FileNotFoundException, IOException {
        System.out.println("Writing");
        FileOutputStream fos = new FileOutputStream("pqr.txt");
        Student s = new Student("aastha", 1, "asdf1234");
        // fos <-> oos <-> nos
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        fos.close();
    }

    public static void main(String[] args) {
        A13 a1 = new A13();
        try {
            a1.writeToFile();
            a1.readFromFile();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
