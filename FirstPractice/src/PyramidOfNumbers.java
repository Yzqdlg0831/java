public class PyramidOfNumbers {
    public static void main(String[] args) {
        for(int i=1;i<6;i++)
        {
            for(int j=5;j>i;j--)//输出空格
            {
                System.out.print(" ");
            }
            for(int k=i;k>0;k--)//输出金字塔左半边数字
            {
                System.out.print(k);
            }
            for(int k=2;k<i+1;k++)//输出金字塔右半边数字
            {
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }
}
