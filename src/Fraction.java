public class Fraction {
    private double numerator;
    private double denominator;

    //KONSTRUKTORY
    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction fraction) {
        numerator = fraction.numerator;
        denominator = fraction.denominator;
    }

    public Fraction(int integer) {
        numerator = integer;
        denominator = 1;
    }

    //METODY
    public Fraction add(Fraction fraction) {
return this;
    }

    public Fraction subtract(Fraction fraction) {
        return this;
    }

    public Fraction multiply(Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
        return this;
    }

    public Fraction divide(Fraction fraction) {
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
        return this;
    }

    public Fraction invert(Fraction fraction) {
        return this;
    }

    public boolean equals(Fraction fraction) {
        return (this.numerator == fraction.numerator &&
                this.denominator == fraction.denominator);
    }

    public boolean isInteger() {
        return ((this.numerator % this.denominator) == 0);
    }

    public boolean hasFiniteDecimalExpansion() {
        return (this.denominator % 2 == 0 ||
                this.denominator % 5 == 0);
    }

    public double doubleValue() {
        return this.numerator / this.denominator;
    }

    public String toString() {
        return "a";
    }

}
