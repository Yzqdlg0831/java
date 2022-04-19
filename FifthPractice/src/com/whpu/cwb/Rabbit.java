package com.whpu.cwb;

public class Rabbit extends Animal {
    public Rabbit(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    public void Eat() {
        System.out.println("兔子eat");
    }

    @Override
    public void MakeASound() {
        System.out.println("兔子叫声");
    }

    @Override
    public void print() {
        System.out.println("兔子  "+"name:"+ this.getName() +" color:"+this.getColor()+" 类型："+this.getType());
    }
}
