import java.util.Arrays;

public final class QuadraticPolynomial extends Polynomial {

    private double delta;

    public QuadraticPolynomial(double a, double b, double c) {
        this.delta = b * b - 4 * a * c;
    }

    public QuadraticPolynomial(double[] coefficients) {
        this.coefficients = Arrays.copyOf(coefficients,
                coefficients.length);
        this.degree = coefficients.length;
    }

    public QuadraticPolynomial(QuadraticPolynomial polynomial) {
        this.coefficients = polynomial.coefficients;
        this.degree = polynomial.degree;
        this.delta = polynomial.delta;
    }

    public QuadraticPolynomial(Polynomial polynomial) {
        this.degree = polynomial.degree;
        this.coefficients = polynomial.coefficients;

    }

    public double discriminant() {
        return this.coefficients[1] * this.coefficients[1] -
                4 * this.coefficients[0] * this.coefficients[2];
    }

    public int numberOfRoots() {
        if (this.delta == 0) {
            return 1;
        } else if (this.delta > 0) {
            return 2;
        } else return 0;
    }

    public boolean hasMaximum() {
        return this.coefficients[0]<0;
    }

    public double extremum() {
        return (- this.coefficients[1])/(2 * this.coefficients[0]);
    }

    public boolean isEvenFunction() {

    }
}
