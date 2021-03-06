package me.petrolingus.task02.task0201;

public class MyComplex {

    private double re;

    private double im;

    private static final double EPS = 1e-12;

    public MyComplex() {
        this(0, 0);
    }

    public MyComplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void setValue(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        return "(" + re + ((im >= 0) ? "+" : "-") + Math.abs(im) + "i)";
    }

    public boolean isReal() {
        return re < EPS;
    }

    public boolean isImaginary() {
        return im < EPS;
    }

    public boolean equals(double re, double im) {
        boolean b0 = this.re - re < EPS;
        boolean b1 = this.im - im < EPS;
        return b0 && b1;
    }

    public boolean equals(MyComplex another) {
        return equals(another.re, another.im);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
    }

    public double argument() {
        return Math.atan2(im, re);
    }

    public MyComplex add(MyComplex right) {
        re += right.getRe();
        im += right.getIm();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(re + right.getRe(),im + right.getIm());
    }

    public MyComplex subtract(MyComplex right) {
        re -= right.getRe();
        im -= right.getIm();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(re - right.getRe(),im - right.getIm());
    }

    public MyComplex multiply(MyComplex right) {
        double re = this.re;
        double im = this.im;
        this.re = re * right.re - im * right.im;
        this.im = re * right.im + im * right.re;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double den = Math.pow(right.magnitude(), 2);
        double re = this.re;
        double im = this.im;
        this.re = (re * right.re + im * right.im) / den;
        this.im = (im * right.re - re * right.im) / den;
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(re, -im);
    }
}
