package com.whpu.cwb;

import javax.swing.*;

public class WordThread1 extends Thread {
    char word;
    int startPosition = 19968;      //Unicode表的19968位置至32320上的汉字
    int endPosition = 32320;
    JTextField showWord;            //显示汉字的文本区域
    int sleepLength=6000;
    public void setJTextField(JTextField t){
        showWord=t;
        showWord.setEditable(false);//使此文本区域不能被编辑
    }
    public void setSleepLength(int n){
        sleepLength=n;
    }
    public void run(){              //线程运行
        int k=startPosition;
        while (true){
            word=(char) k;          //
            showWord.setText(""+word);//组件.setText(String str);将组件上的文字内容设置为str
            try {
                Thread.sleep(sleepLength);//线程类调用sleep方法使线程终端sleeplength毫秒
            }catch (InterruptedException e){}
            k++;
            if (k>=endPosition){
                k=endPosition;
            }
        }
    }
}
