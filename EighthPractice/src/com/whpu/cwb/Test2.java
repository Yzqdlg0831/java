package com.whpu.cwb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        //键盘输入出生日期
        System.out.println("请输入出生日期：格式如：YYYY-MM-dd");
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //将键盘输入的scanner赋值给字符串
        String string = scanner.next();
        //创建SimpleDateFormat对象，用来定义时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        //将字符串对象转化为日期对象
        Date birthDayDate = simpleDateFormat.parse(string);
        //定义当前日期对象
        Date todayDate = new Date();
        //将出生日期和今日日期对象转化为毫秒对象，
        long bithDay = birthDayDate.getTime();
        long toDay = todayDate.getTime();
        //将出生了多长时间计算出来
        long send = toDay - bithDay;
        //判断
        if (send <= 0) {
            System.out.println("还没出生呢");
        } else {
            //因为这里是按毫秒，转化为天
            // 1000毫秒=1秒，一分钟60秒，一个小时60分钟，一天24个小时
            System.out.println("您生活了"+send / 1000 / 60 / 60 / 24+"天");
        }

    }
}