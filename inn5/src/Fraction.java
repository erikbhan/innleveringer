public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (this.denominator == 0) {
            throw new IllegalArgumentException("Denominator can not be 0 (can not divide by 0)");
        }
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void simplify() {
        for (int i = 2; i < this.getDenominator() / 2; i++) {
            if (this.getNumerator() % i == 0 && this.getDenominator() % i == 0) {
                this.numerator = this.getNumerator() / i;
                this.denominator = this.getDenominator() / i;
            }
        }
    }

    public void add(Fraction fractionToAdd) {
        this.numerator = (this.getNumerator() * fractionToAdd.getDenominator()) + (fractionToAdd.getNumerator() * this.getDenominator());
        this.denominator *= fractionToAdd.getDenominator();
        this.simplify();
    }

    public void subtract(Fraction fractionToSubtract) {
        this.numerator = (this.getNumerator() * fractionToSubtract.getDenominator()) - (fractionToSubtract.getNumerator() * this.getDenominator());
        this.denominator *= fractionToSubtract.getDenominator();
        this.simplify();
    }

    public void multiply(Fraction fractionToMultiply) {
        this.numerator *= fractionToMultiply.getNumerator();
        this.denominator *= fractionToMultiply.getDenominator();
        this.simplify();
    }

    public void divide(Fraction fractionToDivideBy) {
        this.numerator *= fractionToDivideBy.getDenominator();
        this.denominator *= fractionToDivideBy.getNumerator();
        this.simplify();
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}