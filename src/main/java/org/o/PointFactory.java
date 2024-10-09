package org.o;

public class PointFactory {

    private static Point2D zero = new Point2D(0, 0);
    static {
        zero = new Point2D(1,1);
    }
    public static Point2D getZero() {
        return zero;
    }
}
