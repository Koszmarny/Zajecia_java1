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
            for (int j = 0; j < size; j++){
                if(i==j){
                    this.elements[i][j]=value;
                } else this.elements[i][j]=0;
            }
        }
        return this;
    }

    public SquareMatrix createZeroMatrix(int size) {
        return this.createScalarDiagonalMatrix(size,0);
    }

    public SquareMatrix createIdentityMatrix(int size) {
        return this.createScalarDiagonalMatrix(size,1);
    }

    public SquareMatrix createDiagonalMatrix(double[] elements) {
        double size = Math.sqrt(elements.length);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                if(i==j){
                    this.elements[i][j]=elements[i];
                } else this.elements[i][j]=0;
            }
        }
        return this;
    }

    public double determinant() {

    }

    public boolean isInvertible() {

    }

    public boolean isDiaonal() {

    }

    public boolean isUpperTriangular() {

    }

    public boolean isLowerTriangular() {

    }

    public boolean isTriangular() {

    }

    public SquareMatrix[] decompositionLU() {

    }

    public boolean isDefinite() {

    }

    public boolean isDefinite(DefinitnessType type)
}
