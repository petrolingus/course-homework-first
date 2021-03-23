package me.petrolingus.task02.task0202;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coefficients) {
        this.coeffs = coefficients;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        //TODO: need to simplify
        return IntStream
                .range(0, coeffs.length)
                .map(i -> getDegree() - i)
                .mapToObj(i ->
                        ((i == getDegree()) ? "" :
                                ((coeffs[i] >= 0) ? "+ " : "- ")) + Math.abs(coeffs[i]) + "x^" + i)
                .collect(Collectors.joining(" "));
    }

    public double evaluate(double x) {
        return IntStream
                .range(0, coeffs.length)
                .parallel()
                .mapToDouble(i -> coeffs[i] * Math.pow(x, i))
                .sum();
    }

    public MyPolynomial add(MyPolynomial right) {
        int length = Math.max(coeffs.length, right.coeffs.length);
        double[] result = new double[length];
        System.arraycopy(coeffs, 0, result, 0, coeffs.length);
        for (int i = 0; i < right.coeffs.length; i++) {
            result[i] += right.coeffs[i];
        }
        return new MyPolynomial(result);
    }

    public MyPolynomial multiple(MyPolynomial right) {
        int n = Math.max(coeffs.length, right.coeffs.length);
        int length = 2 * n - 1;
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < n; j++) {
                double a = (j < coeffs.length) ? coeffs[j] : 0;
                int id = i - j;
                double b = ((id > -1) && (id < right.coeffs.length)) ? right.coeffs[id] : 0;
                result[i] += a * b;
            }
        }
        return new MyPolynomial(result);
    }
}
