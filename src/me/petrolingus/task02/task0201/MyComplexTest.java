package me.petrolingus.task02.task0201;

public class MyComplexTest {

    public static void main(String[] args) {

        MyComplex complex0 = new MyComplex();
        System.out.println(complex0);

        MyComplex complex1 = new MyComplex(1, 1);
        System.out.println(complex1);
        System.out.println("complex1 arg = " + complex1.argument());

        complex0.setValue(6, 2);
        System.out.println("Set complex0 to " + complex0);
        System.out.print("complex0.multiply(complex1) => ");
        complex0.multiply(complex1);
        System.out.println(complex0);
    }
}
