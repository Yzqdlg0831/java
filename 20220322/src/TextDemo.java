import book.Text;

import java.util.Random;
import java.util.Scanner;


class intArray{
    public static void printArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
    public static int[] reverse(int[] list){
        int tep;
        int len = list.length;
        for (int i = 0;i<len>>>1;i++){
            tep = list[i];
            list[i]=list[len-i-1];
            list[len-i-1]=tep;
        }
        return list;
    }
}
class Solution {
    public int numRookCaptures(char[][] board) {
        int[] dy = {1,-1,0,0};
        int[] dx = {0,0,1,-1};
        //车上下移动的距离
        for(int i = 0;i < 8;i++){
            for(int j = 0;j < 8;j++){
                if(board[i][j] == 'R'){
                    int m = 0;//黑卒的个数
                    for(int k = 0;k < 4;k++){
                        int x = i;
                        int y = j;
                        while(true){
                            x += dx[k];
                            y += dy[k];
                            if(x < 0 || x >= 8 || y < 0 || y >= 8 || board[x][y] == 'B'){
                                break;
                            }
                            if(board[x][y]=='p'){
                                m++;
                                break;
                            }
                        }
                    }
                    return m;
                }
            }
        }
        return 0;
    }
}

public class TextDemo {
    public static void main(String[] args) {
        int[][] score = {{10, 3}, {-1, 119, -51}, {100, 56, 90, 49}};
        for (int[] ints : score) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static void main7(String[] args) {
        int[] score = {25, 78, 35, 84, 69, 74, 12, 56};
        int[] age = {32, 52, 12, 63, 42, 15, 75, 23, 56};
        Text.sort(score);                                  //调用排序方法
        Text.print(score);                                 //调用输出方法
        System.out.println("\n-----------------------------------------");
        Text.sort(age);
        Text.print(age);
    }

    public static void main6(String[] args) {

        System.out.println(Text.factorial(10));
    }

    public static void main5(String[] args) {
        int one = Text.add(29, 58);                     //调用addOne()方法
        int three = Text.add(25, 58, 10);                 //调用addOne()方法
        float two = Text.add(26.35f, -12.84f);            //调用addTwo()方法
        System.out.println("add(int x,int y)=" + one);
        System.out.println("add(int x,int y,int z)=" + three);
        System.out.println("add(float x,float y)=" + two);
    }

    public static void main4(String[] args) {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};//对应牌的花色
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //对应牌的号码
        Random rnd = new Random();
        int S = rnd.nextInt(4);
        int R = rnd.nextInt(13);
        System.out.println(suits[S] + " " + ranks[R]);
    }

    public static void main3(String[] args) {
        int[] arr = new int[]{1, 2, 3,4,5};
        intArray.printArray(arr);
        System.out.println();
        int[] arr1 = intArray.reverse(arr);
        for (int j : arr1) {
            System.out.print(j + " ");
        }
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        while (true){
            if(Text.fibonacciNumbers(i)>=0){
                System.out.println(Text.fibonacciNumbers(i));
                break;
            }
            else{
                i = scan.nextInt();
            }
        }
    }
    public static void main1(String[] args) {
        System.out.println(Text.max(1,2)+" "+Text.max(1,2,3)+" "+Text.max(1.0,2.0));
    }
}
