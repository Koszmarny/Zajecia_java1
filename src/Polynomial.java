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
        this.degree = coefficients.length - 1;
    }

    public Polynomial(Polynomial polynomial) {
        this(polynomial.coefficients);
    }

    public Polynomial() {
    }

    //METODY
    private Polynomial shorter(Polynomial polynomial) {              // zwraca wielomian MNIEJSZEGO stopnia
        if (this.degree < polynomial.degree) {
            return this;
        } else return polynomial;
    }

    private Polynomial longer(Polynomial polynomial) {              // zwraca wielomian WIEKSZEGO stopnia
        if (this.degree > polynomial.degree) {
            return this;
        } else return polynomial;
    }

    public Polynomial createNormedMonomial(int degree) {
        return this;
    }

    public Polynomial add(Polynomial polynomial) {
        double[] coefficients = new double[this.longer(polynomial).degree + 1];
        for (int i = 0; i <= (this.shorter(polynomial).degree); i++) {
            coefficients[i] = this.coefficients[i] + polynomial.coefficients[i];
        }
        for (int i = (this.shorter(polynomial).degree) + 1; i <= (this.longer(polynomial).degree); i++) {
            coefficients[i] = this.longer(polynomial).coefficients[i];
        }
        return new Polynomial(coefficients);
    }

    public Polynomial subtract(Polynomial polynomial) {
        double[] coefficients = new double[this.longer(polynomial).degree + 1];
        for (int i = 0; i <= (this.shorter(polynomial).degree); i++) {
            coefficients[i] = this.coefficients[i] - polynomial.coefficients[i];
        }
        for (int i = (this.shorter(polynomial).degree) + 1; i <= (this.longer(polynomial).degree); i++) {
            coefficients[i] = this.longer(polynomial).coefficients[i] * -1;
        }
        return new Polynomial(coefficients);
    }

    public Polynomial multiply(Polynomial polynomial) {
        double[] coefficients = new double[this.longer(polynomial).degree + 1];
        for (int i = 0; i <= (this.shorter(polynomial).degree); i++) {
            coefficients[i] = this.coefficients[i] * polynomial.coefficients[i];
        }
        for (int i = (this.shorter(polynomial).degree + 1); i <= (this.longer(polynomial).degree); i++) {
            coefficients[i] = this.longer(polynomial).coefficients[i];
        }
        return new Polynomial(coefficients);
    }

    public Polynomial divide(Polynomial polynomial) {
        Polynomial po = new Polynomial();
        for (int i = this.shorter(polynomial).degree; i > 0; i++) {
            po.coefficients[i] = this.coefficients[i] / polynomial.coefficients[i];
        }
        return po;
    }

    public Polynomial mod(Polynomial polynomial) {
        Polynomial po = new Polynomial();
        for (int i = this.shorter(polynomial).degree; i > 0; i++) {
            po.coefficients[i] = this.coefficients[i] % polynomial.coefficients[i];
        }
        return this;
    }

    public Polynomial getDerivative() {
        double[] coefficients = new double[this.degree];
        for (int i = this.degree ; i > 0; i--) {
            coefficients[i-1] = i * this.coefficients[i];
        }
        return new Polynomial(coefficients);
    }

    public double valueAt(double x) {
        double wynik = 0;
        for (int i = this.degree; i >= 0; i--) {
            wynik = wynik * x + this.coefficients[i];
        }
        return wynik;
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
