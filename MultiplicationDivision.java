public class MultiplicationDivision {

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        double a = 20;
        double b = 10;

        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }
}