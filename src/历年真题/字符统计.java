package 历年真题;

//时间限制: 1.0s 内存限制: 512.0MB 本题总分：10 分
//        【问题描述】
//        给定一个只包含大写字母的字符串 S ，请你输出其中出现次数最多的字母。如果有多个字
//        母均出现了最多次，按字母表顺序依次输出所有这些字母。
//        【输入格式】
//        一个只包含大写字母的字符串 S .
//        【输出格式】
//        若干个大写字母，代表答案。
//        【样例输入】
//        BABBACAC
//        【样例输出】
//        AB
//实在不行就暴力求解

import java.util.*;
public class 字符统计 {

    public static void main(String[] args){
        int sum=0;
        for(int i=2022;i<=9999;i++) {
            if(f(i)) {
                sum++;
            }
        }
        for(int i=10000;i<=99999;i++) {
            if(fi(i)) {
                sum++;
            }
        }
        for(int i=100000;i<=999999;i++) {
            if(s(i)) {
                sum++;
            }
        }
        for(int i=1000000;i<=9999999;i++) {
            if(se(i)) {
                sum++;
            }
        }
        for(int i=10000000;i<=99999999;i++) {
            if(ei(i)) {
                sum++;
            }
        }
        for(int i=100000000;i<=999999999;i++) {
            if(ni(i)) {
                sum++;
            }
        }
        for(int i=1000000000;i<=2022222022;i++) {
            if(ten(i)) {
                sum++;
            }
        }

        System.out.println(sum);
    }
    public static boolean f(int n) {
        int a[]=new int[4];
        for(int i = 0;i<4;i++) {
            a[i]=n%10;
            n/=10;
        }
        if(a[0]==a[3]&&a[1]==a[2]&&a[0]<=a[1]) {
            return true;
        }
        return false;
    }
    public static boolean fi(int n) {
        int b[]= new int[5];
        for(int i=0;i<5;i++) {
            b[i]=n%10;
            n/=10;
        }
        if(b[0]==b[4]&&b[1]==b[3]&&b[0]<=b[1]&&b[1]<=b[2]) {
            return true;
        }
        return false;
    }
    public static boolean s(int n) {
        int c[]= new int[6];
        for(int i=0;i<6;i++) {
            c[i]=n%10;
            n/=10;
        }
        if(c[0]==c[5]&&c[1]==c[4]&&c[2]==c[3]&&c[0]<=c[1]&&c[1]<=c[2]) {
            return true;
        }
        return false;
    }
    public static boolean se(int n) {
        int d[]= new int[7];
        for(int i=0;i<7;i++) {
            d[i]=n%10;
            n/=10;
        }
        if(d[0]==d[6]&&d[1]==d[5]&&d[2]==d[4]&&d[0]<=d[1]&&d[1]<=d[2]&&d[2]<=d[3]) {
            return true;
        }
        return false;
    }
    public static boolean ei(int n) {
        int e[]= new int[8];
        for(int i=0;i<8;i++) {
            e[i]=n%10;
            n/=10;
        }
        if(e[0]==e[7]&&e[1]==e[6]&&e[2]==e[5]&&e[3]==e[4]&&e[0]<=e[1]&&e[1]<=e[2]&&e[2]<=e[3]) {
            return true;
        }
        return false;
    }
    public static boolean ni(int n) {
        int f[]= new int[9];
        for(int i=0;i<9;i++) {
            f[i]=n%10;
            n/=10;
        }
        if(f[0]==f[8]&&f[1]==f[7]&&f[2]==f[6]&&f[3]==f[5]&&f[0]<=f[1]&&f[1]<=f[2]&&f[2]<=f[3]&&f[3]<=f[4]) {
            return true;
        }
        return false;
    }
    public static boolean ten(int n) {
        int g[]= new int[10];
        for(int i=0;i<10;i++) {
            g[i]=n%10;
            n/=10;
        }
        if(g[0]==g[9]&&g[1]==g[8]&&g[2]==g[7]&&g[3]==g[6]&&g[4]==g[5]&&g[0]<=g[1]&&g[1]<=g[2]&&g[2]<=g[3]&&g[3]<=g[4]) {
            return true;
        }
        return false;
    }

}

