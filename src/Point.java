import java.util.Arrays;

public class Point {

    protected double x;
    protected double y;

    //KONSTRUKTORY
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(Point point) {
        x = point.x;
        y = point.y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(double x, double y) {
        return Math.sqrt((x - this.x) * (x - this.x) +
                (y - this.y) * (y - this.y));
    }

    public double distanceTo(Point point) {
        return Math.sqrt((point.x - this.x) * (point.x - this.x) +
                (point.y - this.y) * (point.y - this.y));
    }

    public Point translateBy(Vector vector) {
        this.x += vector.getComponent(1);
        this.y += vector.getComponent(2);
        return this;
    }

    public Point translateBy(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Point reflectAcrossXAxis() {
        this.y *= -1;
        return this;
    }

    public Point reflectAcrossYAxis() {
        this.x *= -1;
        return this;
    }

    public Point reflectThroughOrigin() {
        this.reflectAcrossXAxis();
        this.reflectAcrossYAxis();
        return this;
    }

    public Point reflectThrough(double x, double y) {
        this.x += 2 * (x - this.x);
        this.y += 2 * (y - this.y);
        return this;
    }

    public Point reflectThrough(Point point) {
        return  this.reflectThrough(point.x, point.y);
    }

    public Point rotateAroundOrigin(double angle) {
        this.x = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        this.y = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        return this;
    }

    public Point rotateAround(double x, double y, double angle) {
        this.x = this.x - x * Math.cos(angle)+(this.y - y)*Math.sin(angle)+x;
        this.y = Math.abs(this.x - x * Math.sin(angle)-(this.y - y)*Math.cos(angle)-y);
        return this;
    }

    public Point rotateAround(Point point, double angle) {
        return this.rotateAround(point.x, point.y, angle);
    }

    public String toString() {
        return "a";
    }
}
