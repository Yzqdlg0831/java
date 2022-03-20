import java.util.Arrays;

public class TextDemo {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int tmp = 0;
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,9,10};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static boolean isUp(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main6(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(isUp(arr));
    }
    public static int binarySearch(int [] array,int key){
        int r = array.length - 1;
        int l = 0;
        int m = r/2;
        while(r >= l){
            if(array[m] == key){
                return m;
            }
            else if(array[m] > key){
                r = m - 1;
                m = (r + l)/2;
            }
            else if(array[m] < key){
                l = m + 1;
                m = (r + l)/2;
            }
        }
        return -1;
    }
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main5(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 10));
    }
    public static int jumpFloor(int n) {
        if(n == 1){
            return 1;
        }
        else if (n == 2){
            return 2;
        }
        return jumpFloor(n-1)+jumpFloor(n-2);
    }
    public static void main4(String[] args) {
        System.out.println(jumpFloor(4));
    }
    public static int sumNum(int n) {
        if(n>9){
            return n%10+sumNum(n/10);
        }
        return n;
    }
    public static int sum(int n) {
        if(n==0){
            return 0;
        }
        return sum(n-1)+n;
    }
    public static void main3(String[] args) {
        System.out.println(sumNum(123));
    }
    public static void printNum(int n) {
        if(n==0){
            System.out.print(n%10+" ");
        }
        else if(n>9){
            printNum(n/10);
            System.out.print(n%10+" ");
        }
        else{
            System.out.print(n+" ");
        }
    }
    public static void main2(String[] args) {
        printNum(88);
    }
    public static int maxInt1(int x, int y){
        return x>y?x:y;
    }
    public static double maxDouble(double x, double y){
        return x>y?x:y;
    }
    public static int maxInt2(int x, int y,int z){
        return maxInt1(maxInt1(x,y),z);
    }
    public static void main1(String[] args) {
        System.out.println(maxInt1(1,2)+" "+maxInt2(1,2,3)+" "+maxDouble(1.0,2.0));
    }
}
