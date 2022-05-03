package com.whpu.cwb;

import java.time.LocalDate;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int y,m;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input year: ");
        y = scan.nextInt();
        System.out.print("Please input month: ");
        m = scan.nextInt();
        //获取当前系统时间
        LocalDate date = LocalDate.now();
        //获取当前的日期
        int year = date.getYear();
        int month = date.getMonth().getValue();
        int day = date.getDayOfMonth();
        //设置指定的日期
        LocalDate date1 = LocalDate.of(y,m,1);
        //获取指定月份的总天数
        int daysOfMonth = date1.getMonth()
                .length(y % 4 == 0 && y % 100 != 0 || y % 400 == 0);
        //获取指定月份前面的空格数
        int space= date1.getDayOfWeek().getValue()-1;
        System.out.println("一\t二\t三\t四\t五\t六\t天");
        int count = 0;
        for (int i = 0; i < space; i++) {
            count++;
            System.out.print("\t");
        }
        for (int i = 1; i <= daysOfMonth; i++) {
            count++;
            //判断是不是当前系统的日期时间
            String src = (y == year && m == month && i == day) ?
                    "" + i + "\t" : i + "\t";
            System.out.print(src);
            if (count % 7 == 0) {
                count = 0;
                System.out.println();
            }
        }
    }
}
