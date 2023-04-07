package A;
class Shape {
    String name;

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
    }

    void printData() {
        System.out.println("NAME : " + name);
    }

}

class Rectangle extends Shape {
    float length;
    float breadth;

    public Rectangle() {

    }

    public Rectangle(String n, float length, float breadth) {
        super(n);
        this.length = length;
        this.breadth = breadth;
    }

    public void printData() {
        super.printData();
        System.out.println("Length:" + length + " x " + "Breadth : " + breadth);
    }
}

class Circle extends Shape {
    float radius;

    public Circle() {

    }

    public Circle(String n, float radius, float pie) {
        super(n);
        this.radius = radius;
    }

    public void printData() {
        super.printData();
        System.out.println("Radius: " + radius);
    }
}

// derived class

class Box extends Rectangle {
    float height;

    public Box() {

    }

    public Box(String n, float l, float b, float height) {
        // accessing parameters of parent class of multi-level inheritance
        super(n, l, b);
        this.height = height;

    }

    public void printData() {
        super.printData();
        System.out.println("Height :" + height);
    }
}

class Cylinder extends Circle {
    float height;

    public Cylinder() {

    }

    public void printData() {
        super.printData();
        System.out.println("Height :" + height);
    }
}

public class A3 {
    public static void main(String[] args) {
        Box b = new Box("Box 1", 10.5f, 20.5f, 30.5f);
        b.printData();
    }
}
