public class LineSegment {

    protected Point endpointA;
    protected Point endpointB;

    //KONSTRUKTORY

    public LineSegment(Point endpointA, Point endpointB) {
        this.endpointA = endpointA;
        this.endpointB = endpointB;
    }

    public LineSegment(double xCoordinateOfEndpointA, double yCoordinateOfEndpointA,
                       double xCoordinateOfEndpointB, double yCoordinateOfEndpointB) {
        this.endpointA.x = xCoordinateOfEndpointA;
        this.endpointA.y = yCoordinateOfEndpointA;
        this.endpointB.x = xCoordinateOfEndpointB;
        this.endpointB.y = yCoordinateOfEndpointB;
    }

    public LineSegment(LineSegment lineSegment) {
        endpointA = lineSegment.endpointA;
        endpointB = lineSegment.endpointB;
    }

    //METODY
    public double length() {
        return this.endpointA.distanceTo(endpointB);
    }

    public Point middlePoint() {
        Point point = new Point();
        point.x = (this.endpointA.x + this.endpointB.x) / 2;
        point.y = (this.endpointA.y + this.endpointB.y) / 2;
        return point;
    }

    public LineSegment translateBy(Vector vector) {
        this.endpointA.translateBy(vector);
        this.endpointB.translateBy(vector);
        return this;
    }

    public LineSegment translateBy(double x, double y) {
        this.endpointA.translateBy(x, y);
        this.endpointB.translateBy(x, y);
        return this;
    }

    public LineSegment reflectAcrossXAxis() {
        this.endpointA.reflectAcrossXAxis();
        this.endpointB.reflectAcrossXAxis();
        return this;
    }

    public LineSegment reflectAcrossYAxis() {
        this.endpointA.reflectAcrossYAxis();
        this.endpointB.reflectAcrossYAxis();
        return this;
    }

    public LineSegment reflectThroughOrigin() {
        this.endpointA.reflectThroughOrigin();
        this.endpointB.reflectThroughOrigin();
        return this;
    }

    public LineSegment reflectThrough(double x, double y) {
        this.endpointA.reflectThrough(x, y);
        this.endpointB.reflectThrough(x, y);
        return this;
    }

    public LineSegment reflectThrough(Point point) {
        this.endpointA.reflectThrough(point);
        this.endpointB.reflectThrough(point);
        return this;
    }

    public LineSegment rotateAroundOrigin(double angle) {
        this.endpointA.rotateAroundOrigin(angle);
        this.endpointB.rotateAroundOrigin(angle);
        return this;
    }

    public LineSegment rotateAround(double x, double y, double angle) {
        this.endpointA.rotateAround(x, y, angle);
        this.endpointB.rotateAround(x, y, angle);
        return this;
    }

    public LineSegment rotateAround(Point point, double angle) {
        this.endpointA.rotateAround(point, angle);
        this.endpointB.rotateAround(point, angle);
        return this;
    }

    public String toString() {
        return "a";
    }
}
