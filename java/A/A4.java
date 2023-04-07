package A;
class Tree {
    String name;

    public Tree() {
    }

    public Tree(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Name: " + name);
    }
}

public class A4 {
    public static void main(String[] args) {
        Tree t1 = new Tree("abc");
        Tree t2 = new Tree("xyz");
        Tree t3 = new Tree("pqr");
        t1.name = "abc tree";

        t1.printName();
        t2.printName();
        t3.printName();
    }
}
