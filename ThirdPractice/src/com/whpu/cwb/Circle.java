package com.whpu.cwb;
import java.lang.Math;

public class Circle{
    private double radius;
    static int numOfObjects = 0;
    int n;
    public Circle(double radius){
        this.radius = radius;
        numOfObjects++;
        n = numOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius*radius*Math.PI;
    }

    public int getN(){
        return n;
    }
}

