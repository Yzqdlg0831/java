package com.whpu.cwb;

public class ExceptionDemo1{
    public static void main(String[] args){
        System.out.println("=============计算开始==========");
        int x=10;
        int y=0;
        try{
            int z=x/y;
            System.out.println("计算结果z= "+z);
        }catch(ArithmeticException e){
            System.out.println("可能出现的异常："+e);
        }
        System.out.println("=============计算结束==========");
    }
}