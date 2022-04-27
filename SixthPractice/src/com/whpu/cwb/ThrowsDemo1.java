package com.whpu.cwb;

class Math1{
    public int div(int i ,int j) throws Exception{
        System.out.println("************计算开始************");
        int temp=0;
        try{
            temp=i/j;
        }catch(Exception e){
            throw e;
        }finally{
            System.out.println("************计算结束************");
        }
        return temp;
    }
}
public class ThrowsDemo1{
    public static void main(String[] args){
        Math m=new Math();
        try{
            System.out.println("结果是："+m.div(10,0));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}