package oops;
import java.util.Scanner;

public class calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        calculator cal = new calculator();

        // System.out.println("Addition : " + cal.addition(10, 20));
        // System.out.println("Substraction : " + cal.substract(10, 20));
        // System.out.println("Multiplicaton : " + cal.multiplication(10, 20));
        // System.out.println("divide : " + cal.divide(10, 20));
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a : ");
        int a = sc.nextInt();

        System.err.print("Enter b : ");
        int b = sc.nextInt();

        System.out.println("\n");

        System.out.println("Addition : " + cal.addition(a, b));
        System.out.println("Substraction : " + cal.substract(a, b));
        System.out.println("Multiplicaton : " + cal.multiplication(a, b));
        System.out.println("Divide : " + cal.divide(a, b));

    }
}
