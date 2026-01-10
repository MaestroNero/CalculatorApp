public class Division extends BinaryOperation {
    public static final String ERROR_MESSAGE = "Division by zero is not allowed.";

    public Division() {
        super("/");
    }

    public Division(String symbol) {
        super(symbol);
    }

    @Override
    public double calculate(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
        return a / b;
    }
}
