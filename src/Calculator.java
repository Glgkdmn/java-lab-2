import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the desired action (1:Addition, 2:Subtraction, 3:Multiplication, 4:Division): ");
        int action = scanner.nextInt();

        double result = performAction(num1, num2, action);

        System.out.println("Result: " + result);
    }

    static double performAction(double num1, double num2, int action) {
        switch (action) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    System.exit(1); // Exit the program due to division by zero
                }
            default:
                System.out.println("Invalid action. Please enter a number between 1 and 4.");
                System.exit(1); // Exit the program due to invalid action
        }
        return 0;
    }
}
