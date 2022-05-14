package com.whpu.cwb;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//主线程
public class ThreadFrame extends JFrame implements ActionListener {
    JTextField showWord;
    JButton button;
    JTextField inputText,showScore;//输入框，展示得分
    WordThread1 giveWord;//内部有一个giveword副线程
    JLabel ID=new JLabel();
    int score=0;
    ThreadFrame(){
        //设置显示文字区域的样式
        showWord=new JTextField(6);
        showWord.setFont(new Font("",Font.BOLD,72));
        showWord.setHorizontalAlignment(JTextField.CENTER);
        //设置副线程
        giveWord=new WordThread1();
        giveWord.setJTextField(showWord);
        giveWord.setSleepLength(5000);
        //设置其他组件
        button=new JButton("开始");
        inputText=new JTextField(10);
        showScore=new JTextField(5);
        //设置其他组件监视器以及位置
        button.addActionListener(this);
        inputText.addActionListener(this);
        add(button,BorderLayout.NORTH);    //
        add(showWord,BorderLayout.CENTER); //
        showScore.setEditable(false);
        //BorderLayout布局 最下方插入面板，内含三个组件：标签，输入框，展示得分
        JPanel southP=new JPanel();
        southP.add(new JLabel("输入汉字（回车）:"));
        southP.add(inputText);
        southP.add(showScore);
        add(southP,BorderLayout.SOUTH);
        //设置窗口基本样式
        setBounds(100,100,350,180);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override//重写监视器
    public void actionPerformed(ActionEvent e) {
        //按钮监视器
        if (e.getSource()==button){
            if(!(giveWord.isAlive())){     //如果当前线程没开始，创建一个线程
                giveWord=new WordThread1();
                giveWord.setJTextField(showWord);
                giveWord.setSleepLength(5000);
            }
            try{
                giveWord.start();
            }catch (Exception exe){
            }
        }
        //输入框监视器
        else if (e.getSource()==inputText){
            if (inputText.getText().equals(showWord.getText())){
                score++;         //如果输入的汉字与showWord中的内容匹配 得1分
            }
            showScore.setText("得分："+score);
            inputText.setText(null);
        }
    }
}
