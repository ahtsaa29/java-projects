package A;

class OuterClass {
    String name;

    // inner class
    class InnerClass {
        String name;

        public InnerClass() {
        }

        public InnerClass(String name) {
            this.name = name;
        }

        void printName() {
            System.out.println(name);
        }
    }

    public OuterClass() {
    }

    public OuterClass(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println(name);
        InnerClass i = new InnerClass("this is inner class");
        i.printName();
    }
}

public class A5 {
    public static void main(String[] args) {
        OuterClass o = new OuterClass("the name of outerclass");
        o.printName();

        // innerclass cant be accessed from outisde
        // InnerClass i = new InnerClass();
    }
}
