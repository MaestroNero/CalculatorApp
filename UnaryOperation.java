public abstract class UnaryOperation extends Operation {
    public UnaryOperation(String symbol) {
        super(symbol);
    }

    public abstract double calculate(double a);

    @Override
    public double calculate(double a, double b) {
        return calculate(a);
    }
}
