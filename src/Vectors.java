public class Vectors extends Vector {
    ////prywatne konstruktory
    public static Vector sum(Vector v1, Vector v2) {
//        Vector v = new Vector(v1);
        /*
        for (int i = 0; i < v1.size(); i++) {
            v.getComponent(i) = v1.getComponent(i) + v2.getComponent(i);
        }*/
        return v1.sum(v2);
    }

    public static Vector difference(Vector v1, Vector v2) {
/*        Vector v = new Vector();
        for (int i = 0; i < v1.size(); i++) {
            double dif = v1.getComponent(i) - v2.getComponent(i);
            v.getComponent(i) = dif;
        }*/
        return v1.difference(v2);
    }

    public static Vector scalarMultiplication;

    ///////?????
    ///////statyczne metody ????
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
}
