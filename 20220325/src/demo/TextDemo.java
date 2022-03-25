package demo;
class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        char[] chars1 = str1.toCharArray(), chars2 = str2.toCharArray();

        // lcs
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (chars1[i - 1] == chars2[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // 倒推出lcs
        StringBuilder lcs = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (chars1[i - 1] == chars2[j - 1]) {
                lcs.append(chars1[i - 1]);
                i--;
                j--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) i--;
                else j--;
            }
        }

        // 构建答案
        String s = lcs.reverse().toString();
        char[] chars = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        int p = 0, q = 0;
        for (char c : chars) {
            while (p < n && chars1[p] != c) ans.append(chars1[p++]);
            while (q < m && chars2[q] != c) ans.append(chars2[q++]);
            ans.append(c);
            p++;
            q++;
        }
        while (p < n) ans.append(chars1[p++]);
        while (q < m) ans.append(chars2[q++]);
        return ans.toString();
    }
}
public class TextDemo {

}
