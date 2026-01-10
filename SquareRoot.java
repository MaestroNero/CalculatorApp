public class SquareRoot extends UnaryOperation {
    public static final String NEGATIVE_INPUT_MESSAGE = "Square root of negative numbers is undefined for real numbers.";

    public SquareRoot() {
        super("sqrt");
    }

    public SquareRoot(String symbol) {
        super(symbol);
    }

    @Override
    public double calculate(double a) {
        if (a < 0) {
            throw new IllegalArgumentException(NEGATIVE_INPUT_MESSAGE);
        }
        return Math.sqrt(a);
    }
}
