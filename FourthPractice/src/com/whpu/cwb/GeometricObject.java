package com.whpu.cwb;

abstract public class GeometricObject {
    private String color;

    public GeometricObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public double findArea();
    abstract public double findPerimeter();
}
