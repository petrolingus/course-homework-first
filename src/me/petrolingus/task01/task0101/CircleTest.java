package me.petrolingus.task01.task0101;

public class CircleTest {

    public static void main(String[] args) {

        // Testing the constructor without parameters
        Circle circle0 = new Circle();
        System.out.println(circle0);
        System.out.println("circle0 radius = " + circle0.getRadius());
        System.out.println("circle0 color = " + circle0.getColor());
        System.out.println("circle0 area = " + circle0.getArea() + "\n");

        // Testing the constructor with one parameter
        Circle circle1 = new Circle(2);
        System.out.println(circle1);
        System.out.println("circle1 radius = " + circle1.getRadius());
        System.out.println("circle1 color = " + circle1.getColor());
        System.out.println("circle1 area = " + circle1.getArea() + "\n");

        // Testing the constructor with two parameters
        Circle circle2 = new Circle(4, "aqua");
        System.out.println(circle2);
        System.out.println("circle2 radius = " + circle2.getRadius());
        System.out.println("circle2 color = " + circle2.getColor());
        System.out.println("circle2 area = " + circle2.getArea() + "\n");

        // Testing getters
        Circle circle3 = new Circle();
        System.out.println(circle0);
        circle3.setRadius(32);
        circle3.setColor("brown");
        System.out.println(circle3);
    }
}
