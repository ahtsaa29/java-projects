// Dynamic Method Dispatch
// only possible in inheritance
// is decided in runtime
class A {
    void printData() {
        System.out.println("Class A");
    }
}

class B extends A {
    void printData() {
        System.out.println("Class B");
    }
}

class C extends B {
    void printData() {
        System.out.println("Class C");
    }
}

public class A14 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        // a.printData();
        // b.printData();
        // c.printData();
        A a1;
        a1 = a;
        a1.printData();
        a1 = b;
        a1.printData();
        a1 = c;
        a1.printData();
    }
}