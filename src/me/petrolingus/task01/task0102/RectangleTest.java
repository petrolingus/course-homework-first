package me.petrolingus.task01.task0102;

import me.petrolingus.task01.task0101.Circle;

public class RectangleTest {

    public static void main(String[] args) {

        // Testing the constructor without parameters
        Rectangle rectangle0 = new Rectangle();
        System.out.println(rectangle0);
        System.out.println("rectangle0 length = " + rectangle0.getLength());
        System.out.println("rectangle0 width = " + rectangle0.getWidth());
        System.out.println("rectangle0 area = " + rectangle0.getArea());
        System.out.println("rectangle0 perimeter = " + rectangle0.getPerimeter() + "\n");

        // Testing the constructor with two parameters
        Rectangle rectangle1 = new Rectangle(1920, 1080);
        System.out.println(rectangle1);
        System.out.println("rectangle1 length = " + rectangle1.getLength());
        System.out.println("rectangle1 width = " + rectangle1.getWidth());
        System.out.println("rectangle1 area = " + rectangle1.getArea());
        System.out.println("rectangle1 perimeter = " + rectangle1.getPerimeter() + "\n");

        // Testing getters
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2);
        rectangle2.setLength(12);
        rectangle2.setWidth(20);
        System.out.println(rectangle2);
    }
}
