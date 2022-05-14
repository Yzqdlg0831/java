package com.whpu.cwb;
public class Test1 {
    public static void main(String[] args) {
        System.out.println("**************开始抢票**************");
        Ticket ticket=new Ticket();
        Thread th1=new Thread(ticket);
        th1.setName("窗口1");
        th1.start();
        Thread th2=new Thread(ticket);
        th2.setName("窗口2");
        th2.start();
        Thread th3=new Thread(ticket);
        th3.setName("窗口3");
        th3.start();
    }
}
