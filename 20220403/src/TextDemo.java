
//["c","f","j"]
//        "a"
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        if (target >= letters[length - 1]) {
            return letters[0];
        }
        int left = 0, right = length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return letters[left];
    }
}

public class TextDemo {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        Solution solution = new Solution();
        System.out.println(solution.nextGreatestLetter(arr, 'a'));
    }
}
