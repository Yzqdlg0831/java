package com.whpu.cwb;

public class Circle extends GeometricObject {
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double findArea() {
        return this.r * this.r * Math.PI;
    }

    @Override
    public double findPerimeter() {
        return 2 * this.r * Math.PI;
    }
}
