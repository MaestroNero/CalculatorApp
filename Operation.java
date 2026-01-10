public abstract class Operation {
    protected String symbol;

    public Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract double calculate(double a, double b);
}
