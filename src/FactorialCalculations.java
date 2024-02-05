import java.util.Scanner;

class FactorialCalculations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			try {
			    if (number < 0) {
			        throw new IllegalArgumentException("Input must be a non-negative integer.");
			    }

			    FactorialCalculations calculator = new FactorialCalculations();
			    long result = calculator.calculateFactorial(number);

			    System.out.println("Factorial of " + number + " is: " + result);
			} catch (IllegalArgumentException e) {
			    System.out.println("Error: " + e.getMessage());
			}
		}
    }

    long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
