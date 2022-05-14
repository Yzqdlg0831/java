package com.whpu.cwb;
public class Ticket implements Runnable{
    private int num=20;   //票数总数为20
    private  int i=1;   //抢到票的次数
    @Override
    public void run() {
        while (true){
            if(num>0){
                System.out.println(Thread.currentThread().getName()+"抢到第"+(i++)+"张票，剩余"+(--num));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}