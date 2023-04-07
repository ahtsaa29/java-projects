package A;

// import java.util.Scanner;
import java.util.*;

public class A9 {
    public A9() {
    }

    // kun exception throw garne banaune tyo chaii throws --- ma add garnu parcha,
    // multiple garda ni huncha
    public void checkForZero(float z) throws IllegalArgumentException {
        if (z == 0) {
            throw new IllegalArgumentException();
        }

    }

    public void divide() {
        // to take user input
        // system.in = keyboard
        // initializer sc

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numerator: ");
            // take input
            float a = sc.nextFloat();
            System.out.println("Enter denominator: ");
            float b = sc.nextFloat();
            checkForZero(b);
            float c = a / b;
            System.out.println(c);

        } catch (InputMismatchException ime) {
            System.out.println("Enter a number please");
        } catch (IllegalArgumentException iae) {
            System.out.println("denominator cant be zero");
        } finally {
            System.out.println("Completed");
        }
    }

    public static void main(String[] args) {
        A9 num = new A9();
        num.divide();
    }
}
