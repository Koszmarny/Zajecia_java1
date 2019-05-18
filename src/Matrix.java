import java.util.Arrays;

public class Matrix {
    protected double[][] elements;
    protected int numberOfRows;
    protected int numberOfColumns;

    public Matrix(double[][] elements) {
        this.numberOfRows = 1;
        this.numberOfColumns =1;
        this.elements[i][j] = elements[i][j];

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
        double[][] elements = new double[rows][columns];
        return new Matrix(elements);
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
        return Arrays.equals(this.elements,createZeroMatrix(this.numberOfRows,this.numberOfColumns).elements);
    }

    public boolean equals(Matrix matrix){
        return Arrays.equals(this.elements,matrix.elements);
    }


    public int getNumberOfRows(){
        return this.numberOfRows;
    }

    public int getNumberOfColumns(){
        return this.numberOfColumns;
    }

    public double getElement(int rowIndex, int columnIndex){
        return this.elements[rowIndex][columnIndex];
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
