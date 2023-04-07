package A;

public class A11 extends Thread {
    // implements Runnable{

    String name;

    public A11() {
    }

    public A11(String name) {
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
        A11 t1 = new A11("thread 0");
        // start func call garnu parcha, not run
        t1.start();
        A11 t2 = new A11("thread 1");
        t2.start();
    }
}