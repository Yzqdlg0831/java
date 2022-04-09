package com.whpu.cwb;

public class Rectangle extends GeometricObject {
    private double L;//长
    private double W;//宽
    public Rectangle(String color, double L, double W) {
        super(color);
        this.L = L;
        this.W = W;
    }

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    public double getW() {
        return W;
    }

    public void setW(double w) {
        W = w;
    }

    @Override
    public double findArea() {
        return this.L * this.W;
    }

    @Override
    public double findPerimeter() {
        return 2 * (this.L + this.W);
    }
}
