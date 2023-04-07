package A;
abstract class Shape2D {
    String name;
    final float PI = 3.14f;

    public Shape2D() {
    }

    public Shape2D(String name) {
        this.name = name;
    }

    // function cha, working thaa hudaina
    abstract void printArea();

    void printName() {
        System.out.println(name);
    }
}

class Circle1 extends Shape2D {
    float r;

    public Circle1() {
    }

    public Circle1(float r, String name) {
        super(name);
        this.r = r;
    }

    void printArea() {
        super.printName();
        System.out.println(PI * r * r);
    }
}

class Rectangle1 extends Shape2D {
    float l, b;

    public Rectangle1() {
    }

    public Rectangle1(float l, float b, String name) {
        super(name);
        this.l = l;
        this.b = b;
    }

    void printArea() {
        super.printName();
        System.out.println(l * b);
    }
}

class Square1 extends Shape2D {
    float l;

    public Square1() {
    }

    public Square1(float l, String name) {
        super(name);
        this.l = l;
    }

    void printArea() {
        super.printName();
        System.out.println(l * l);
    }
}

public class A6 {
    public static void main(String[] args) {
        Circle1 c = new Circle1(7.0f, "Golo golo circle1");
        c.printArea();
        Rectangle1 r = new Rectangle1(5.5f, 3.4f, "char patey rectangle1");
        r.printArea();
        Square1 s = new Square1(3.4f, "Square ho ");
        s.printArea();
    }
}