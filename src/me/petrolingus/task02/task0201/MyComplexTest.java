package me.petrolingus.task02.task0201;

public class MyComplexTest {

    public static void main(String[] args) {

        MyComplex complex0 = new MyComplex();
        System.out.println(complex0);

        MyComplex complex1 = new MyComplex(1, 1);
        System.out.println(complex1);
        System.out.println("complex1 arg = " + complex1.argument());
    }
}
