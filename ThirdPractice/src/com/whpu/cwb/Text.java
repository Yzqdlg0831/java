package com.whpu.cwb;

public class Text {

    public static void main2(String[] args) {
        Rational r1 = new Rational(2,1);
        Rational r2 = new Rational(2,3);
        System.out.println(r1.toString()+" + "+r2.toString()+" = "+(r1.add(r2)).toString());//加
        System.out.println(r1.toString()+" - "+r2.toString()+" = "+(r1.subtract(r2)).toString());//减
        System.out.println(r1.toString()+" × "+r2.toString()+" = "+(r1.multiply(r2)).toString());//乘
        System.out.println(r1.toString()+" ÷ "+r2.toString()+" = "+(r1.divide(r2)).toString());//除
    }
    public static void printCircle(Circle c){
        System.out.println("第"+ c.getN()+"个园的半径："+c.getRadius());
        System.out.println("第"+ c.getN()+"个园的面积："+c.area());
    }
    public static void main1(String[] args) {
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(4);
        Circle c3 = new Circle(5);
        printCircle(c1);
        printCircle(c2);
        printCircle(c3);
    }
}

