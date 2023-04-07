package A;
// for multiple inheritance class A extends B implements D,E
abstract class Shape2D {
    String name;
    final float PI = 3.14f;

    public Shape2D() {
    }

    public Shape2D(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println(name);
    }

    abstract void printArea();
}

interface Calculator {
    public void add();

    public void subtract();
}

class IntegerCalculator implements Calculator {
    int a, b;

    public IntegerCalculator() {
    }

    public IntegerCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        int c = a + b;
        System.out.println(c);
    }

    public void subtract() {
        int c = a - b;
        System.out.println(c);
    }
}

class FloatCalculator implements Calculator {
    float a, b;

    public FloatCalculator() {
    }

    public FloatCalculator(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        float c = a + b;
        System.out.println(c);
    }

    public void subtract() {
        float c = a - b;
        System.out.println(c);
    }
}

class ComplexCalculator implements Calculator {
    int[] a;
    int[] b;

    public ComplexCalculator() {
    }

    public ComplexCalculator(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        int c = a[0] + b[0];
        int d = a[1] + b[1];
        System.out.println(c + "+i" + d);
    }

    public void subtract() {
        int c = a[0] - b[0];
        int d = a[1] - b[1];
        System.out.println(c + "-i" + d);
    }
}

public class A7 {
    public static void main(String[] args) {
        IntegerCalculator i = new IntegerCalculator(5, 6);
        FloatCalculator f = new FloatCalculator(5.5f, 6.2f);
        int[] m = { 5, 9 };
        int[] n = { 2, 3 };
        ComplexCalculator c = new ComplexCalculator(m, n);
        i.add();
        f.add();
        c.add();
        i.subtract();
        f.subtract();
        c.subtract();
    }
}
