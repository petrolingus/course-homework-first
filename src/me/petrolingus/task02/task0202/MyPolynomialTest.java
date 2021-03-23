package me.petrolingus.task02.task0202;

public class MyPolynomialTest {

    public static void main(String[] args) {

        MyPolynomial polynomial = new MyPolynomial(2, 3, 1);

        double x = 0;
        double y = polynomial.evaluate(x);
        System.out.println("f(x) = " + polynomial);
        System.out.println("f(" + x + ") = " + y + "\n");

        MyPolynomial polynomial2 = new MyPolynomial(2, 5, 1);
        MyPolynomial polynomial3 = new MyPolynomial(1, 4, 6, 1);
        System.out.println("g(x) = " + polynomial2);
        System.out.println("h(x) = " + polynomial3);
        MyPolynomial sum = polynomial2.add(polynomial3);
        System.out.println("g(x) + h(x) = " + sum);

        polynomial2 = new MyPolynomial(2, 1);
        polynomial3 = new MyPolynomial(4, 5, 6);
        System.out.println("g(x) = " + polynomial2);
        System.out.println("h(x) = " + polynomial3);
        MyPolynomial mul = polynomial2.add(polynomial3);
        System.out.println("g(x) * h(x) = " + mul);

    }
}
