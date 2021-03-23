package me.petrolingus.task01.task0106;

public class MyTriangleTest {

    public static void main(String[] args) {

        MyDoublePoint[] points = {
                new MyDoublePoint(0, 0),
                new MyDoublePoint(0, 1),
                new MyDoublePoint(1, 0),
        };

        MyTriangle triangle = new MyTriangle(points[0], points[1], points[2]);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType() + "\n");


        MyDoublePoint[] points2 = new MyDoublePoint[3];
        points2[0] = new MyDoublePoint(0, 0);
        points2[1] = new MyDoublePoint(0.5, Math.sqrt(3) / 2.0);
        points2[2] = new MyDoublePoint(1, 0);

        MyTriangle triangle2 = new MyTriangle(points2[0], points2[1], points2[2]);
        System.out.println(triangle2);
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2.getType());

    }
}
