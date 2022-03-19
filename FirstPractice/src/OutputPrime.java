public class OutputPrime {
    public static void main(String[] args) {
        int t=0;//计数器
        for (int prime=2;t<50;prime++) {
            int isprime=1;//判断是否为素数
            if (prime % 2 == 0&&prime>2)//排除偶数
                isprime = 0;
            else
                for (int i = 3; i <= (int) Math.sqrt(prime); i = i + 2)//判断奇数即可
                    if (prime % i == 0)
                        isprime = 0;
            if (isprime == 1) {
                System.out.print(prime + " ");
                t++;
            }
            //找到十个素数后换行，判断isprime==1避免了t刚好为十的倍数但是此时的prime不是素数的情况
            if(t%10==0&&isprime==1){
                System.out.print("\n");
            }
        }
    }
}