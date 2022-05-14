package com.whpu.cwb;

public class Test2 {
    public static void main(String[] args) {
        Reward reward = new Reward();
        new Thread(reward,"抽奖1").start();//启动线程
        new Thread(reward,"抽奖2").start();
    }
}
