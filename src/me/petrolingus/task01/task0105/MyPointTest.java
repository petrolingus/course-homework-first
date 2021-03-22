package me.petrolingus.task01.task0105;

public class MyPointTest {

    public static void main(String[] args) {

        MyPoint point0 = new MyPoint();
        System.out.println(point0);

        MyPoint point1 = new MyPoint(3, 4);
        System.out.println(point1);

        double distance = point0.distance(point1);
        System.out.println("The distance between point0 and point1 is equal " + distance);
    }
}
