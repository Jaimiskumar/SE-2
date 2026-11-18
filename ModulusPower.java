import java.util.Scanner;

public class ModulusPower {

    // Method for modulus
    public static double modulus(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Cannot calculate modulus by zero");
        }

        return a % b;
    }

    // Method for power
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Operation (modulus/power): ");
        String operation = scanner.next();
        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double result;
        if ("modulus".equalsIgnoreCase(operation)) {
            result = modulus(a, b);
        } else if ("power".equalsIgnoreCase(operation)) {
            result = power(a, b);
        } else {
            throw new IllegalArgumentException("Operation must be modulus or power");
        }

        System.out.println("Result: " + result);
    }
}