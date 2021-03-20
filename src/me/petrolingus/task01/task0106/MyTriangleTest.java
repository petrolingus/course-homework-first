package me.petrolingus.task01.task0106;

import me.petrolingus.task01.task0105.MyPoint;

public class MyTriangleTest {

    public static void main(String[] args) {

//        MyPoint[] points = {
//                new MyPoint(0, 0),
//                new MyPoint(0, 1),
//                new MyPoint(1, 0),
//        };
//
//        MyTriangle triangle = new MyTriangle(points[0], points[1], points[2]);
//        System.out.println(triangle);
//        System.out.println(triangle.getPerimeter());
//        System.out.println(triangle.getType());

        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(0, 0);
        MyPoint point3 = new MyPoint(0, 0);

        for (int i = 2; i < 10_000; i += 2) {
            point2.setX(i);
        }
    }
}
