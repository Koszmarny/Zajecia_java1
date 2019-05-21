public final class SquareMatrix extends Matrix {
    public SquareMatrix(double[][] elements) {

    }

    public SquareMatrix(Vector[] rows) {

    }

    public SquareMatrix(SquareMatrix matrix) {

    }

    private SquareMatrix createScalarDiagonalMatrix
            (int size, double value) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    this.elements[i][j] = value;
                } else this.elements[i][j] = 0;
            }
        }
        return this;
    }

    public SquareMatrix createZeroMatrix(int size) {
        return this.createScalarDiagonalMatrix(size, 0);
    }

    public SquareMatrix createIdentityMatrix(int size) {
        return this.createScalarDiagonalMatrix(size, 1);
    }

    public SquareMatrix createDiagonalMatrix(double[] elements) {
        double size = Math.sqrt(elements.length);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    this.elements[i][j] = elements[i];
                } else this.elements[i][j] = 0;
            }
        }
        return this;
    }

    public double determinant() {
return 0;
    }

    public boolean isInvertible() {
return true;
    }

    public boolean isDiaonal() {
        return true;
    }

    public boolean isUpperTriangular() {
        return true;
    }

    public boolean isLowerTriangular() {
        return true;
    }

    public boolean isTriangular() {
        return true;
    }

    public SquareMatrix[] decompositionLU() {
        return null;
    }

    public boolean isDefinite() {
        return true;
    }

    public boolean isDefinite(DefinitenessType type) {
        return true;
    }

    public DefinitenessType getDefiniteness() {
        return null;
    }
}