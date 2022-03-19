import java.util.Random;
import java.util.Scanner;
class intArray{
    public static void printArray(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static int[] reverse(int[] list){
        int tep;
        int len = list.length;
        for (int i = 0;i<(int)(len/2);i++){
            tep = list[i];
            list[i]=list[len-i-1];
            list[len-i-1]=tep;
        }
        return list;
    }
}
public class TEXT {
    public static void main(String args[]){
        int score[][]={{10,3},{-1,119,-51},{100,56,90,49}};
        for(int i=0;i<score.length;i++){
            for(int j=0;j<score[i].length;j++){
                System.out.print(score[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void main7(String args[]){
        int score[]={25,78,35,84,69,74,12,56};
        int age[]={32,52,12,63,42,15,75,23,56};
        sort(score);                                  //调用排序方法
        print(score);                                 //调用输出方法
        System.out.println("\n-----------------------------------------");
        sort(age);
        print(age);
    }
    public static void sort(int temp[]){                  //数组排序
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
    public static void print(int x[]){                    //数组输出
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" , ");
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
    public static void main6(String[] args) {
        System.out.println(factorial(10));
    }
    public static void main5(String args[]){
        int one=add(29,58);                     //调用addOne()方法
        int three=add(25,58,10);                 //调用addOne()方法
        float two=add(26.35f,-12.84f);            //调用addTwo()方法
        System.out.println("add(int x,int y)="+one);
        System.out.println("add(int x,int y,int z)="+three);
        System.out.println("add(float x,float y)="+two);
    }
    public static int add(int x,int y){     //定义方法，两个整数加法，返回一个整型数据
        int temp=0;                //temp为局部变量，只在此方法中有效
        temp=x+y;
        return temp;               //返回计算结果
    }
    public static int add(int x,int y,int z){ //定义方法，两个整数加法，返回一个整型数据
        int temp=0;                //temp为局部变量，只在此方法中有效
        temp=x+y+z;
        return temp;              //返回计算结果
    }
    public static float add(float x,float y){
        float temp=0;
        temp=x+y;
        return temp;
    }
    public static void main4(String[] args) {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};//对应牌的花色
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //对应牌的号码
        Random rnd = new Random();
        int S = rnd.nextInt(4);
        int R = rnd.nextInt(13);
        System.out.println(suits[S]+" "+ranks[R]);
    }
    public static void main3(String[] args) {
        int[] arr = new int[]{1, 2, 3,4,5};
        intArray intArray = new intArray();
        intArray.printArray(arr);
        System.out.println();
        arr = intArray.reverse(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
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
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
       while (true){
           if(fibonacciNumbers(i)>=0){
               System.out.println(fibonacciNumbers(i));
               break;
           }
           else{
               i = scan.nextInt();
           }
       }
    }
    public static int maxInt1(int x, int y){
        return x>y?x:y;
    }
    public static double maxDouble(double x, double y){
        return x>y?x:y;
    }
    public static int maxInt2(int x, int y,int z){
        if(x>z){
            return x>y?x:y;
        }
        else{
            return z>y?z:y;
        }
    }
    public static void main1(String[] args) {
        System.out.println(maxInt1(1,2)+" "+maxInt2(1,2,3)+" "+maxDouble(1.0,2.0));
    }
}
