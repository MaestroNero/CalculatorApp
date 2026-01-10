public class Power extends BinaryOperation {
    public Power() {
        super("^");
    }

    public Power(String symbol) {
        super(symbol);
    }

    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
}
