import javax.swing.*;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 31;i >= 1;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        for (int i = 30;i >= 0;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }
    }
    public static void main17(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while (n!=0){
            n = n&(n-1);
            count++;
        }
        System.out.println("count:"+count);
    }
    public static void main16(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 0;i < 32;i++){
            if(((n>>i)&1)==1){
                count++;
            }
        }
        System.out.println("count="+count);
    }
    public static void main15(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        while(num != 0){
            if(num%2 == 1){
                count++;
            }
            num = num/2;
        }
        System.out.println("这个数转换成二进制数后有"+count+"个‘1’");
    }
    public static void main14(String[] args) {
        int count = 3;
        while(count != 0){
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入密码：");
            String password = scan.nextLine();
            if (password.equals("123123")){
                System.out.println("密码正确！");
                break;
            }
            else{
                count--;
                System.out.println("密码错误！请再次输入密码，剩余次数："+count);
            }
        }
    }
    public static void main13(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1;i<=num;i++){
            int len = 0;
            for(int j = i;j>0;len++){
                j = j/10;
            }
            int sum = 0;
            int j = i;
            while(j!=0){
                sum += Math.pow(j%10,len);
//                System.out.println(i);
                j = j/10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
    public static void main12(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for(int i = n;i>0;i--){
            double len = 0;
            for(int j = i;j>0;len++){
                j = j/10;
            }
            int j = i;
            while(len>0){
                if(j == 9){
                    count++;
                    break;
                }
                if(j%10 == 9){
                    count++;
                }
                j = j/10;
                len--;
            }

        }
        System.out.println(count);
    }
    public static void main11(String[] args) {
        double sum = 0.0;
        for(double i = 1.0;i <= 100;i++){
            sum += Math.pow(-1.0,i-1)/i;
        }
        System.out.println(sum);

    }
    public static void main10(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;
        if(a>b){
            c = b;
        }
        else{
            c = a;
            a = b;
            b = c;
        }
        while(a%b != 0){
            c = a%b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
    public static void main9(String[] args) {
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"    ");
            }
            System.out.println("");
        }
    }
    public static void main8(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int year=1000;year <= n;year++){
            if((year%4==0&&year%100!=0)||(year%400==0)){
                System.out.println(year);
            }
        }
    }
    public static void main7(String[] args) {
        for(int i = 1000;i<2000;i++){
            if(i%2!=0){
                int j = 3;
                for(;j<=(int)Math.sqrt(i);j=j+2){
                    if(i%j==0){
                        break;
                    }
                }
                if(i%j!=0){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main6(String[] args) {
        int sum = 0;
        int num = 5;
        int ret = 1;
        int i = 1;
        while(i<=num){
            ret*=i;
            i++;
            sum+=ret;
        }
        System.out.println(sum);
    }
    public static void main5 (String args[ ]) {
        System.out.println("给你一个1至100之间的整数,请猜测这个数");
        int realNumber = (int) (Math.random() * 100) + 1;
        int yourGuess = 0;
        String str = JOptionPane.showInputDialog("输入您的猜测:");
        yourGuess = Integer.parseInt(str);
        while (yourGuess != realNumber) //循环条件
        {
            if (yourGuess > realNumber) //条件代码
            {
                str = JOptionPane.showInputDialog("猜大了,再输入你的猜测:");
                yourGuess = Integer.parseInt(str);
            } else if (yourGuess < realNumber) //条件代码
            {
                str = JOptionPane.showInputDialog("猜小了,再输入你的猜测:");
                yourGuess = Integer.parseInt(str);
            }
        }
        System.out.println("猜对了!");
    }
    public static void main4(String args[]) {
        int number=0,d5,d4,d3,d2,d1;
        String str=JOptionPane.showInputDialog("输入一个1至99999之间的数");
        number=Integer.parseInt(str);
        if(number>=1&&number<=99999) //判断number在1至99999之间的条件
        {
            d5=number/10000;
            d4=number%10000/1000;
            d3=number%1000/100;
            d2=number%100/10;
            d1=number%10;
            if(d5!=0)  //判断number是5位数的条件
            {
                System.out.println(number+"是5位数");
                if(d1==d5&&d2==d4) //判断number是回文数的条件
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d4!=0)  //判断number是4位数的条件
            {
                System.out.println(number+"是4位数");
                if(d1==d4&&d2==d3) //判断number是回文数的条件码
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d3!=0)  //判断number是3位数的条件
            {
                System.out.println(number+"是3位数");
                if(d1==d3) //判断number是回文数的条件
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d2!=0)
            {
                System.out.println(number+"是2位数");
                if(d1==d2)
                {
                    System.out.println(number+"是回文数");
                }
                else
                {
                    System.out.println(number+"不是回文数");
                }
            }
            else if(d1!=0)
            {
                System.out.println(number+"是1位数");
                System.out.println(number+"是回文数");
            }
        }
        else
        {
            System.out.printf("\n%d不在1至99999之间",number);
        }
    }
    public static void main3 (String args[ ]) {
        int startPosition=0,endPosition=0;
        char cStart='α',cEnd='ω';
        startPosition=(int)cStart;
        endPosition=(int)cEnd ;
        System.out.println("希腊字母\'α\'在unicode表中的顺序位置:"+(int)cStart);
        System.out.println("希腊字母表：");
        for(int i=startPosition;i<=endPosition;i++)
        {
            char c='\0';
            c=(char)i;
            System.out.print(" "+c);
            if((i-startPosition+1)%10==0)
                System.out.println("");
        }
    }
    public static void main2 (String args[ ]) {
        System.out.println("你好，只需编译我");
        A a=new A();
        a.fA();
        B b=new B();
        b.fB();
    }
    public static void main1 (String args[ ]) {
        System.out.println("你好，很高兴学习Java") ;
        A a=new A();
        a.fA();
    }
}
