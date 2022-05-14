package com.whpu.cwb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reward implements Runnable{
    int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
    List<Integer> list = new ArrayList<>();

    public void run() {	//重写run方法
        while(true) {
            lottery();
            if(list.size() == arr.length)
                break;//当list长度和arr长度相等时说明执行完毕，结束循环
        }
    }

    public synchronized void lottery() {
        int index = new Random().nextInt(arr.length);//随机获取数组下标
        if(!list.contains(index)) {//判断list中有没有重复添加素组下标，如果重复则不执行
            list.add(index);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            String name = Thread.currentThread().getName();//获取线程名字
            if(name.equals("抽奖1"))
                System.out.println(name+"又产生了一个"+arr[index]+"元大奖");
            else
                System.out.println(name+"又产生了一个"+arr[index]+"元大奖");
        }
    }
}