package 蓝桥官网题;

import java.util.Scanner;
//问题描述
//        今年是 2021 年, 2021 这个数字非常特殊, 它的千位和十位相等, 个位比 百位大 1 ，我们称满足这样条件的年份为特殊年份。
//        输入 5 个年份, 请计算这里面有多少个特殊年份。
//        输入格式:输入 5 行, 每行一个 4 位十进制数 (数值范围为 1000 至 9999), 表示一个 年份。
//        输出格式:输出一个整数, 表示输入的 5 个年份中有多少个特殊年份。

//看懂题目，是同时输入5行


public class 特殊年份 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int[] str = new int[5];
        for(int i=0;i<5;i++){
            str[i] = scan.nextInt();
        }
        int sum = 0;
        for(int i=0;i<5;i++){
            int a = str[i]/1000;//千位
            int b = (str[i]/100)%10;//百位
            int c = (str[i]/10)%10;//十位
            int d = str[i]%10;//个位
            int e = d-b;//个位与百位之差
            if(a==c){
                if(e==1)sum++;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}