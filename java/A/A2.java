package A;
class Person {
    private String name;
    public String email;

    public Person() {
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printDetails() {
        System.out.println(name);
        System.out.println(email);
    }

    // to assign value for private property
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Student extends Person {
    int roll;

    public Student() {
    }

    public Student(String n, String e, int roll) {
        super(n, e);
        this.roll = roll;
    }

    public void printDetails() {
        // System.out.println(name);
        // System.out.println(email);
        super.printDetails();
        System.out.println(roll);
    }
}

class Teacher extends Person {
    int salary;

    public Teacher(String n, String e, int salary) {
        super(n, e);
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(salary);
    }
}

public class A2 {
    public static void main(String[] args) {
        // Student s = new Student("Aastha", "aastha@gamail.com", 1);
        // s.printDetails();
        Student s = new Student();
        // s.name = "aa";
        s.setName("Aastha");
        s.getName();
        s.email = "aas";
        s.roll = 2;
        s.printDetails();
    }
}
