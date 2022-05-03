package com.whpu.cwb;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String target;
        String template;
        Scanner scan = new Scanner(System.in);
        target = scan.next();
        template = scan.next();
        int count = 0;
        int i = 0;
        while(i != -1)
        {
            i = template.indexOf(target,i);
            if(i != -1)
            {
                count++;
                i = i + 1;
            }
        }
        System.out.println(target + "在" + template + "中出现的次数为：" + count);
    }
}
