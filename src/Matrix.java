import java.util.Arrays;

public class Matrix {
    protected double[][] elements;
    protected int numberOfRows;
    protected int numberOfColumns;

    public Matrix(double[][] elements) {
        this.elements = elements;
    }

    public Matrix(Vector[] rows) {
        this.numberOfRows = rows.length;
    }

    public Matrix(Matrix matrix) {
        elements = matrix.elements;
        numberOfRows = matrix.numberOfRows;
        numberOfColumns = matrix.numberOfColumns;
    }
    public Matrix(){}

    public Matrix createZeroMatrix(int rows, int columns){
        double[][] M = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                M[i][j] = 0;
            }
        }
        Matrix m = new Matrix(M);
        return m;
    }

    public Matrix add(Matrix matrix){
        return this;
    }

    public Matrix subtract(Matrix matrix){
        return this;
    }

    public Matrix multiply(Matrix matrix){
        return this;
    }

    public Matrix multiply(double number){
        return this;
    }

    public Matrix transpose(){
        return this;
    }

    public Vector getRow(int index){
        Vector v = new Vector();
        return v;
    }


    public Vector getColumn(int index){
        Vector v = new Vector();
        return v;
    }

    public boolean isZeroMatrix(){
        return true;
    }

    public boolean equals(Matrix matrix){
        return Arrays.equals(this.elements,matrix.elements);
    }


    public int getNumberOfRows(){
        return 0;
    }

    public int getNumberOfColumns(){
        return 0;
    }

    public double getElement(int rowIndex, int columnIndex){
        return 0;
    }

    public double getMaxAbsElement(){
        return 0;
    }

    public double[][] toArray(){
        return Arrays.copyOf(this.elements,this.elements.length);
    }

    public String toString(){
        return Arrays.toString(this.elements);
    }

}
