package 算法题;

//状态：F（i）：第 i 项的值
//状态转移方程：：F（i）=：F（i-1）+：F（i-2）
//初始状态：F（0）= 1，F（1）= 1
//返回结果：第 n 项的结果

public class 斐波那契数 {

    static int fi1(int n) {

        //创建一个数组，用来保存中间状态的解
        int[] arr = new int[n + 1];
        //初始化
        arr[0] = 0;
        arr[1] = 1;
        //状态变化方程
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            //System.out.println(arr[i]);
        }
        //返回结果
        return arr[n];
    }

    static int fi2(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fn = 0;
        int f1=1;
        int f2=0;
        for(int i=2;i<=n;i++){
            fn=f1+f2;
            f2=f1;
            f1=fn;
        }
        return fn;

    }
    public static void main(String[] args) {
        int ret1 = fi1(9);
        int ret2 = fi2(9);
        System.out.println(ret1+" "+ret2);

    }
}
