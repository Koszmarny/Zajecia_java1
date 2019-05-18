import java.util.Arrays;

public class Polynomial {

    //POLA
    public static final Polynomial ZERO = new Polynomial(new double[]{0});
    public static final Polynomial ONE = new Polynomial(new double[]{1});
    public static final Polynomial X = new Polynomial(new double[]{0, 1});
    protected double[] coefficients;
    protected int degree;

    //KONSTRUKTORY
    public Polynomial(double[] coefficients) {
        this.coefficients = Arrays.copyOf(coefficients, coefficients.length);
        this.degree = coefficients.length;
    }

    public Polynomial(Polynomial polynomial) {
        coefficients = Arrays.copyOf(polynomial.coefficients, polynomial.degree);
        degree = polynomial.degree;
    }

    public Polynomial() {
    }

    //METODY
    private Polynomial shorter(Polynomial polynomial) {              // zwraca wielomian MNIEJSZEGO stopnia
        if (this.degree < polynomial.degree) {
            return this;
        } else return polynomial;
    }

    public Polynomial createNormedMonomial(int degree) {
        return this;
    }

    public Polynomial add(Polynomial polynomial) {
        for (int i = this.shorter(polynomial).degree; i > 0; i++) {
            this.coefficients[i] += polynomial.coefficients[i];
        }
        return this;
    }

    public Polynomial subtract(Polynomial polynomial) {
        for (int i = this.shorter(polynomial).degree; i > 0; i++) {
            this.coefficients[i] -= polynomial.coefficients[i];
        }
        return this;
    }

    public Polynomial multiply(Polynomial polynomial) {
        for (int i = this.shorter(polynomial).degree; i > 0; i++) {
            this.coefficients[i] *= polynomial.coefficients[i];
        }
        return this;
    }

    public Polynomial divide(Polynomial polynomial) {
        for (int i = this.shorter(polynomial).degree; i > 0; i++) {
            this.coefficients[i] /= polynomial.coefficients[i];
        }
        return this;
    }

    public Polynomial mod(Polynomial polynomial) {
        for (int i = this.shorter(polynomial).degree; i > 0; i++) {
            this.coefficients[i] %= polynomial.coefficients[i];
        }
        return this;
    }

    public Polynomial getDerivative() {
        Polynomial pol = new Polynomial();
        int degree = this.degree - 1;
        for (int i = 0; i < this.degree; i++) {
            pol.coefficients[i] = degree * this.coefficients[i];
            degree--;
        }
        return pol;
    }

    public double valueAt(double x) {
        int degree = this.degree;
        double result = 0;
        for (int i = 0; i < this.degree; i++) {
            result += Math.pow(this.coefficients[i] * x, degree);
            degree--;
        }
        return result;
    }

    public boolean isZeroPolynomial() {
        return this.equals(ZERO);
    }

    public boolean isConstantPolynomial() {
        return this.equals(X);
    }

    public boolean equals(Polynomial polynomial) {
        return Arrays.equals(this.coefficients, polynomial.coefficients);
    }

    public int getDegree() {
        return this.degree;
    }

    public double[] toArray() {
        return Arrays.copyOf(this.coefficients, this.degree);
    }

    public String toString() {
        return Arrays.toString(this.coefficients);
    }
}
