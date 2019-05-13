import java.lang.reflect.Array;
import java.util.Arrays;

public class Vector {
    private double[] components;
    private int dimension;

    ////////////////////////////////konstruktory
    public Vector() {
    }

    public Vector(double[] vectorComponents) {
        this.components = vectorComponents;
        this.dimension = components.length;
    }

    public Vector(int dimension) {
        this.components = new double[dimension];
        this.dimension = dimension;
    }

    public Vector(Vector v) {
        components = v.components;
        dimension = v.dimension;
    }

    ////////////////////////////////metody
    public int getDimension() {
        return this.dimension;
    }

    public double getComponent(int index) {
        return this.components[index];
    }

    public double[] toArray() {
        return Arrays.copyOf(this.components, this.dimension);
    }

    public String toString() {
        return Arrays.toString(this.components);
    }

    public double length() {
        return this.components.length;
    }

    public Vector add(Vector v) {
        for (int i = 0; i < this.dimension; i++) {
            this.components[i] += v.components[i];
        }
        return this;
    }

    public Vector sum(Vector v) {
        return Vectors.sum(this, v);
    }

    public Vector subtract(Vector v) {
        for (int i = 0; i < this.dimension; i++) {
            this.components[i] -= v.components[i];
        }
        return this;
    }

    public Vector difference(Vector v) {
        return Vectors.difference(this, v);
    }

    public Vector rescale(double factor) {
        for (int i = 0; i < this.dimension; i++) {
            this.components[i] *= factor;
        }
        return this;
    }

    public Vector scalarMultiplication(double factor) {
        Vector result = new Vector(this);
        result = result.rescale(factor);
        return result;
    }

    public double angle(Vector v) {
        return Math.acos(this.scalarProduct(v) / (this.length() * v.length()));
    }

    public double size() {
        return this.dimension;
    }

/*    Vector vectorProduct(Vector v) {
        for (int i = 0; )
    }*/

    public double dotProduct(Vector v) {
        if (v.dimension == this.dimension) {
            double S = 0;
            for (int i = 0; i < this.dimension; i++) {
                S += (this.components[i] * v.components[i]);
            }
            return S;
        }
        return 0;
    }

    public double scalarProduct(Vector v) {
        double prod = 0;
        for (int i = 0; i < this.dimension; i++) {
            prod += this.components[i] *= v.components[i];
        }
        return prod;
    }
}
