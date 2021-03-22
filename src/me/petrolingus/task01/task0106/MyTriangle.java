package me.petrolingus.task01.task0106;

public class MyTriangle {

    private MyDoublePoint v1;

    private MyDoublePoint v2;

    private MyDoublePoint v3;

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this(new MyDoublePoint(x1, y1), new MyDoublePoint(x2, y2), new MyDoublePoint(x3, y3));
    }

    public MyTriangle(MyDoublePoint v1, MyDoublePoint v2, MyDoublePoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }

    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        if (side1 == side2 && side1 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
