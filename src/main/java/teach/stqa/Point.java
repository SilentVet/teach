package teach.stqa;

import static java.lang.Math.sqrt;

public class Point {
    public double a;
    public double b;

    public  Point(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double destination() {
        return sqrt((this.a - this.b) + (this.a - this.b));
    }
    }