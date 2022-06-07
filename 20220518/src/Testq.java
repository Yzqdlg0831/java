import java.util.Scanner;

public class Testq {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,6,8};
        System.out.println((a[0] += a[1]) + ++a[2]);
        int c = 1;
        int b = 2;
        int d = 3;
        System.out.println((c+=b)+d);
    }

}
