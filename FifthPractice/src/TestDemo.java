import com.whpu.cwb.*;

import java.util.Scanner;

public class TestDemo {
    public static void menu(){
        System.out.println("********************************************");
        System.out.println("*****--------1.Radio--------****************");
        System.out.println("*****--------2.Walkman------****************");
        System.out.println("*****--------3.Mobilephone--****************");
        System.out.println("*****--------4.Exit--------****************");
        System.out.println("********************************************");
    }
    public static void main(String[] args) {
        int input;
        boolean flas = true;
        Scanner scan = new Scanner(System.in);
        Soundable M = new Mobilephone();
        Soundable R = new Radio();
        Soundable W = new Walkman();
        while(flas)
        {
            System.out.println("想听那种设备？");
            menu();
            input = scan.nextInt();
            switch (input) {
                case 1 -> {
                    R.phonation();
                    R.ModulateTheSound();
                }
                case 2 -> {
                    W.phonation();
                    W.ModulateTheSound();
                }
                case 3 -> {
                    M.phonation();
                    M.ModulateTheSound();
                }
                case 4 -> flas = false;
                default -> System.out.println("选择错误！");
            }
        }
    }
}
