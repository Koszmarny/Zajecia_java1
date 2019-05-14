public class Vectors extends Vector {
    public static Vector sum(Vector v1, Vector v2) {
        return v1.sum(v2);
    }

    public static Vector difference(Vector v1, Vector v2) {
        return v1.difference(v2);
    }

    public static Vector scalarMultiplication(Vector v, double factor) {
        return v.scalarMultiplication(factor);
    }

    public static Vector scalarMultiplication(double factor, Vector v) {
        return v.scalarMultiplication(factor);
    }

    public static double dotProduct(Vector v1, Vector v2) {
        return v1.dotProduct(v2);
    }

    public static double scalarProduct(Vector v1, Vector v2) {
        return v1.scalarProduct(v2);
    }

    public static double angle(Vector v1, Vector v2) {
        return v1.angle(v2);
    }

    public static double length(Vector v) {
        return v.length();
    }

    public static double dimensions(Vector v) {
        return v.getDimension();
    }

    public static String toString(Vector v) {
        return v.toString();
    }

    public static double[] toArray(Vector v) {
        return v.toArray();
    }

    public static int dimension(Vector v) {
        return v.getDimension();
    }

    public static double component(Vector v, int index) {
        return v.getComponent(index);
    }

    public static double component(int index, Vector v) {
        return v.getComponent(index);
    }


}
