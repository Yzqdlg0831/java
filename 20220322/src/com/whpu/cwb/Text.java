package com.whpu.cwb;

public class Text {
    public static void sort(int[] temp){                  //数组排序
        for(int i=1;i<temp.length;i++){               //冒泡算法
            for(int j=0;j<temp.length;j++){
                if(temp[i]<temp[j]){
                    int x=temp[i];
                    temp[i]=temp[j];
                    temp[j]=x;
                }
            }
        }
    }
    public static void print(int[] x){                    //数组输出
        for (int j : x) {
            System.out.print(j + " , ");
        }
    }
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static int add(int x,int y){     //定义方法，两个整数加法，返回一个整型数据
        int temp;                //temp为局部变量，只在此方法中有效
        temp=x+y;
        return temp;               //返回计算结果
    }
    public static int add(int x,int y,int z){ //定义方法，两个整数加法，返回一个整型数据
        int temp;                //temp为局部变量，只在此方法中有效
        temp=x+y+z;
        return temp;              //返回计算结果
    }
    public static float add(float x,float y){
        float temp;
        temp=x+y;
        return temp;
    }

    public static int fibonacciNumbers(int x) {
        if (x >= 2) {
            return fibonacciNumbers(x - 1) + fibonacciNumbers(x - 2);
        }
        else if(x==0){
            return 0;
        }
        else if(x==1){
            return 1;
        }
        else{
            System.out.println("请输入正整数:");
            return -1;
        }
    }

    public static int max(int x, int y){
        return x>y?x:y;
    }
    public static double max(double x, double y){
        return x>y?x:y;
    }
    public static int max(int x, int y,int z){
        return max(max(x,y),z);
    }
}
