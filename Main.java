
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SE-2 BASIC CALCULATOR =====");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Power (^)");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 7) {
                System.out.println("Thank you for using calculator!");
                break;
            }

            if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            try {

                double result;

                switch (choice) {

                    case 1:
                        result = AdditionSubtraction.add(a, b);
                        break;

                    case 2:
                        result = AdditionSubtraction.subtract(a, b);
                        break;

                    case 3:
                        result = MultiplicationDivision.multiply(a, b);
                        break;

                    case 4:
                        result = MultiplicationDivision.divide(a, b);
                        break;

                    case 5:
                        result = ModulusPower.modulus(a, b);
                        break;

                    case 6:
                        result = ModulusPower.power(a, b);
                        break;

                    default:
                        continue;
                }

                System.out.println("Result = " + result);

            } catch (ArithmeticException e) {

                System.out.println("Error: " + e.getMessage());

            }
        }

        sc.close();
    }
}
