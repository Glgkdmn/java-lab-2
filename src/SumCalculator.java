import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values to sum: ");
        int numberOfValues = scanner.nextInt();

        // Check if the user entered a non-positive number
        if (numberOfValues <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int sum = 0;
        int count = 0;

        do {
            System.out.print("Enter value " + (count + 1) + ": ");
            int value = scanner.nextInt();
            sum += value;
            count++;
        } while (count < numberOfValues);

        System.out.println("Sum of the entered values: " + sum);
    }
}
