public class Currency {
    private final double exchangeRate;
    private final String name;

    public Currency(double exchangeRate, String name) {
        this.exchangeRate = exchangeRate;
        this.name = name;
    }

    public double convertToNOK(double amount) {
        return amount * this.exchangeRate;
    }

    public double convertFromNOK(double amount) {
        return amount / this.exchangeRate;
    }

    @Override
    public String toString() {
        return name;
    }
}