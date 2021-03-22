package me.petrolingus.task01.task0106;

import me.petrolingus.task01.task0105.MyPoint;

public class MyDoublePoint {

    private final double x;

    private final double y;

    public MyDoublePoint() {
        this(0, 0);
    }

    public MyDoublePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(MyDoublePoint another) {
        return Math.sqrt(Math.pow(x - another.x, 2) + Math.pow(y - another.y, 2));
    }
}
