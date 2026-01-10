import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    private final Scanner scanner;
    private Operation currentOperation;

    public CalculatorApp() {
        this(new Scanner(System.in));
    }

    public CalculatorApp(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        app.run();
    }

    public void run() {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");
            try {
                switch (choice) {
                    case 1 -> executeBinary(new Addition());
                    case 2 -> executeBinary(new Division());
                    case 3 -> executeBinary(new Power());
                    case 4 -> executeUnary(new SquareRoot());
                    case 0 -> {
                        running = false;
                        System.out.println("Exiting Advanced Calculator System. Goodbye!");
                    }
                    default -> System.out.println("Invalid option. Please try again.");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            System.out.println();
        }
    }

    private void printMenu() {
        System.out.println("=== Advanced Calculator System ===");
        System.out.println("1. Addition (a + b)");
        System.out.println("2. Division (a / b)");
        System.out.println("3. Power (a ^ b)");
        System.out.println("4. Square Root (sqrt a)");
        System.out.println("0. Exit");
    }

    private void executeBinary(BinaryOperation operation) {
        currentOperation = operation;
        double first = readDouble("Enter first number: ");
        double second = readDouble("Enter second number: ");
        double result = currentOperation.calculate(first, second);
        printResult(new double[]{first, second}, result);
    }

    private void executeUnary(UnaryOperation operation) {
        currentOperation = operation;
        double input = readDouble("Enter number: ");
        double result = currentOperation.calculate(input, 0);
        printResult(new double[]{input}, result);
    }

    private void printResult(double[] inputs, double result) {
        String representation;
        if (inputs.length == 2) {
            representation = inputs[0] + " " + currentOperation.getSymbol() + " " + inputs[1];
        } else {
            representation = currentOperation.getSymbol() + "(" + inputs[0] + ")";
        }
        System.out.println("Result: " + representation + " = " + result);
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Invalid integer. Please try again.");
                scanner.nextLine();
            }
        }
    }

    private double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Invalid number. Please try again.");
                scanner.nextLine();
            }
        }
    }
}
