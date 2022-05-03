package com.whpu.cwb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        //用户输入一个生日字符串，计算他活了多少天，多少时，多少秒
        System.out.println("请按格式输入生日：yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String birthday = sc.next();
        //生日的正则表达式
        String a = "^\\d{4}-\\d{2}-\\d{2}";
        //判断用户输入的生日是否匹配正则表达式
        if (birthday.matches(a)) {
            //将用户输入的生日转换为date格式
            String s1 = "yyyy-MM-dd";
            SimpleDateFormat sdf = new SimpleDateFormat(s1);
            //将String转换为date格式
            Date date = sdf.parse(birthday);
            //当前时间
            Date now = new Date();
            //getTime返回至1970年1月1日到此日期的毫秒数
            long time = now.getTime();
            //Date date2 = new Date();
            //返回输入的生日到1970-01-01的毫秒数
            long time2 = date.getTime();
            //相减就得到你已经活了的毫秒数
            long sum = time - time2;
            //转换成天数
            long day = sum / 1000 / 60 / 60 / 24;
            System.out.println("已经在世上生活了" + day + "天\n");
        } else {
            System.out.println("输入的生日格式不对！");
        }
    }
}