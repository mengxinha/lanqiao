package 历年真题;

//时间限制: 1.0s 内存限制: 512.0MB
//        本题总分：15 分
//        【问题描述】
//        满足 N! 的末尾恰好有 K 个 0 的最小的 N 是多少?
//        如果这样的 N 不存在输出 −1。
//        【输入格式】
//        一个整数 K。
//        【输出格式】
//        一个整数代表答案。
//        【样例输入】
//        2
//        【样例输出】
//        10
//        【评测用例规模与约定】
//        对于 30% 的数据，1 ≤ K ≤ .
//        对于 100% 的数据，1 ≤ K ≤ .

import java.util.*;

public class 求阶乘 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        for(int N = 1;N<10000;N++) {
            int y = N;
            int j=1;
            for(int i = 1;i<=y;i++) {//算阶乘
                j*=i;
            }
            if(k(j,K)) {//调用，判断是否符合
                System.out.println(y);
                return;//输出后就结束
            }
        }
        System.out.println(-1);//如果不存在就输出-1
    }
    public static boolean k(int j,int K) {
        int a = 0;
        int sum = 0;
        while(j!=0) {
            a=j%10;
            if(a!=0) {//记得写！！如果末尾不是0就停止
                break;
            }
            if(a==0) {
                sum++;
            }
            j/=10;
        }
        if(sum==K) {//如果末尾0的个数等于k就返回true
            return true;
        }
        return false;
    }


}
