public class Addition extends BinaryOperation {
    public Addition() {
        super("+");
    }

    public Addition(String symbol) {
        super(symbol);
    }

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
