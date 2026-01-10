public abstract class BinaryOperation extends Operation {
    public BinaryOperation(String symbol) {
        super(symbol);
    }

    @Override
    public abstract double calculate(double a, double b);
}
