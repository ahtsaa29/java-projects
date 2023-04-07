package A;
// anonymous class

abstract class Shape2Da {
    String name;
    final float PI = 3.14f;

    public Shape2Da() {
    }

    public Shape2Da(String name) {
        this.name = name;
    }

    abstract void printArea(float[] a);

    void printName() {
        System.out.println(name);
    }
}

public class A8 {
    public static void main(String[] args) {
        Shape2Da c = new Shape2Da() {
            public void printArea(float[] p) {
                System.out.println(PI * p[0] * p[0]);
            }
        };
        c.name = "Circle";
        c.printName();
        float p[] = { 5.5f };
        c.printArea(p);
        Shape2Da r = new Shape2Da() {
            public void printArea(float[] q) {
                System.out.println(q[0] * q[1]);
            }
        };
        r.name = "Rectangle";
        r.printName();
        float q[] = { 5.5f, 3.5f };
        r.printArea(q);
    }
}