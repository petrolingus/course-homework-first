package me.petrolingus.task02.task0201;

public class MyComplex {

    private double re = 0.0;

    private double im = 0.0;

    public MyComplex() {
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
}
