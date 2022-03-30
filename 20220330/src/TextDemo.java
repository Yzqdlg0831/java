import java.util.Objects;

//独一无二的字符串 指的是在一个数组中只出现过 一次 的字符串。
//给你一个字符串数组 arr 和一个整数 k ，请你返回 arr 中第 k 个 独一无二的字符串 。如果 少于 k 个独一无二的字符串，那么返回 空字符串 "" 。
//注意，按照字符串在原数组中的 顺序 找到第 k 个独一无二字符串。
public class TextDemo {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        Solution solution = new Solution();
        System.out.println(solution.kthDistinct(arr, 2));
    }
}

class Solution {
    public String kthDistinct(String[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            boolean flash = true;
            for (int j = 0; j < arr.length; j++) {
                if(i != j &&Objects.equals(arr[i], arr[j])){
                    flash = false;
                    break;
                }
            }
            if (flash){
                k--;
            }
            if(k == 0) {
                return arr[i];
            }
        }
        return "";
    }
}