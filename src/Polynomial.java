import java.util.Arrays;

public class Polynomial {

    //POLA
    public Polynomial ZERO;
    public Polynomial ONE;
    public Polynomial X;
    protected double[] coefficients;
    protected int degree;

    //KONSTRUKTORY
    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
        this.degree = coefficients.length + 1;
    }


    public Polynomial(Polynomial polynomial) {
        coefficients = polynomial.coefficients;
        degree = polynomial.degree;
    }

    public Polynomial() {
    }

    //METODY
    Polynomial longer(Polynomial polynomial) {              // zwraca wielomian MNIEJSZEGO stopnia
        if (this.degree < polynomial.degree) {
            return this;
        } else return polynomial;
    }

    Polynomial createNormedMonomial(int degree) {
        return this;
    }

    Polynomial add(Polynomial polynomial) {
        for (int i = this.longer(polynomial).degree; i > 0; i++) {
            this.coefficients[i] += polynomial.coefficients[i];
        }
        return this;
    }

    Polynomial subtract(Polynomial polynomial) {
        for (int i = this.longer(polynomial).degree; i > 0; i++) {
            this.coefficients[i] -= polynomial.coefficients[i];
        }
        return this;
    }

    Polynomial multiply(Polynomial polynomial) {
        return this;
    }

    Polynomial divide(Polynomial polynomial) {
        return this;
    }

    Polynomial mod(Polynomial polynomial) {
        return this;
    }

    Polynomial getDerivative() {
        Polynomial pol = new Polynomial();
        int degree = this.degree - 1;
        for (int i = 0; i < this.degree; i++) {
            pol.coefficients[i] = degree * this.coefficients[i];
            degree--;
        }
        return pol;
    }

    double valueAt(double x) {
        int degree = this.degree;
        double result = 0;
        for (int i = 0; i < this.degree; i++) {
            result += Math.pow(this.coefficients[i] * x, degree);
            degree--;
        }
        return result;
    }

    boolean isZeroPolynomial() {
        return this.equals(ZERO);
    }

    boolean isConstantPolynomial() {
        return this.equals(ONE);
    }

    boolean equals(Polynomial polynomial) {
        return Arrays.equals(this.coefficients, polynomial.coefficients);
    }

    int getDegree() {
        return this.degree;
    }

    double[] toArray() {
        return Arrays.copyOf(this.coefficients, this.degree);
    }

    public String toString() {
        return Arrays.toString(this.coefficients);
    }
}
