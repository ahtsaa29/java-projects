package A;

public class A12 implements Runnable {

    String name;

    public A12() {
    }

    public A12(String name) {
        this.name = name;
    }

    // thread banayesii run func hunu parcha
    public void run() {
        while (true) {
            System.out.println(name);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {
        A12 t1 = new A12("thread 0");
        // start func call garnu parcha, not run
        A12 t2 = new A12("thread 1");
        Thread n1 = new Thread(t1);
        n1.start();
        Thread n2 = new Thread(t2);
        n2.start();
    }
}