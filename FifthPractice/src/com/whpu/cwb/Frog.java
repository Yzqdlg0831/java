package com.whpu.cwb;

public class Frog extends Animal implements Swimmable{
    public Frog(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    public void Eat() {
        System.out.println("青蛙eat");
    }

    @Override
    public void MakeASound() {
        System.out.println("青蛙叫声");
    }

    @Override
    public void swim() {
        System.out.println("青蛙游泳");
    }

    @Override
    public void print() {
        System.out.println("青蛙  "+"name:"+ this.getName() +" color:"+this.getColor()+" 类型："+this.getType());
    }
}
