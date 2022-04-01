import java.util.Scanner;

public class TextDemo{

    public static String func(String str,int n){
        return reverse(reverse(reverse(str,0,n-1),n,str.length()-1),0,str.length()-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(func(str, n));
    }

    public static String reverse(String str, int begin, int end) {
        char[] arr = str.toCharArray();
        if(begin == end){
            return str;
        }
        while (end > begin){
            char tmp;
            tmp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = tmp;
            end--;
            begin++;
        }
       return new String(arr);
    }
    public static void main1(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length() - 1);
        System.out.println(ret);
    }
}
