import java.lang.reflect.Array;
import java.util.Arrays;

public class Vector {
    private double[] components;
    private int dimension;

    ////////////////////////////////konstruktory
    public Vector() {
    }

    public Vector(double[] vectorComponents) {
        this.components = Arrays.copyOf(vectorComponents, vectorComponents.length);
        this.dimension = components.length;
    }

    public Vector(int dimension) {
        this.components = new double[dimension];
        this.dimension = dimension;
    }

    public Vector(Vector v) {
        components = Arrays.copyOf(v.components, v.dimension);
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
        return Math.sqrt(this.dotProduct(this));
    }

    public Vector add(Vector v) {
        for (int i = 0; i < this.dimension; i++) {
            this.components[i] += v.components[i];
        }
        return this;
    }

    public Vector sum(Vector v) {
        Vector vec = new Vector(this);
        return vec.add(v);
    }

    public Vector subtract(Vector v) {
        for (int i = 0; i < this.dimension; i++) {
            this.components[i] -= v.components[i];
        }
        return this;
    }

    public Vector difference(Vector v) {
        Vector vec = new Vector(this);
        return vec.subtract(v);
    }

    public Vector rescale(double factor) {
        for (int i = 0; i < this.dimension; i++) {
            this.components[i] *= factor;
        }
        return this;
    }

    public Vector scalarMultiplication(double factor) {
        Vector vec = new Vector(this);
        return vec.rescale(factor);
    }

    public double angle(Vector v) {
        return Math.acos((this.dotProduct(v)) / (this.length() * v.length()));
    }

    public double dotProduct(Vector v) {
        return this.scalarProduct(v);
    }

    public double scalarProduct(Vector v) {
        double prod = 0;
        for (int i = 0; i < this.dimension; i++) {
            prod += this.components[i] * v.components[i];
        }
        return prod;
    }
}
