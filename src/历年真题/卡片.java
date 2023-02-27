package 历年真题;
//
//小蓝有很多数字卡片，每张卡片上都是数字 0 到 9。
//        小蓝准备用这些卡片来拼一些数，他想从 1 开始拼出正整数，每拼一个， 就保存起来，卡片就不能用来拼其它数了。
//        小蓝想知道自己能从 1 拼到多少。
//        例如，当小蓝有 30 张卡片，其中 0 到 9 各 3 张，则小蓝可以拼出 1 到 10， 但是拼 11 时卡片 1 已经只有一张了，不够拼出 11。
//        现在小蓝手里有 0 到 9 的卡片各 2021 张，共 20210 张，请问小蓝可以从 1 拼到多少？

import java.util.*;
public class 卡片 {
    public static void main(String[] args) {
        int []kp=new int [10];
        for(int i=0;i<10;i++){
            kp[i]=2021;
        }
        for(int j=1;j<10000;j++){
            if(j>0&&j<10){
                kp[j]--;
                if(kp[j]<0){
                    System.out.println(j-1);
                    return;
                }
            }
            else if(j>9&&j<100){
                int a=j/10;
                int b=j%10;
                kp[a]--;
                kp[b]--;
                if(kp[a]<0){
                    System.out.println(j-1);
                    return;
                }
                if(kp[b]<0){
                    System.out.println(j-1);
                    return;
                }
            }
            else if(j>99&&j<1000){
                int a=j/100;
                int b=j/10%10;
                int c=j%10;
                kp[a]--;
                kp[b]--;
                kp[c]--;
                if(kp[a]<0){
                    System.out.println(j-1);
                    return;
                }
                if(kp[b]<0){
                    System.out.println(j-1);
                    return;
                }
                if(kp[c]<0){
                    System.out.println(j-1);
                    return;
                }

            }
            else if(j>999&&j<10000){
                int a=j/1000;
                int b=j/100%10;
                int c=j/10%10;
                int d=j%10;
                kp[a]--;
                kp[b]--;
                kp[c]--;
                kp[d]--;
                if(kp[a]<0){
                    System.out.println(j-1);
                    return;
                }
                if(kp[b]<0){
                    System.out.println(j-1);
                    return;
                }
                if(kp[c]<0){
                    System.out.println(j-1);
                    return;
                }
                if(kp[d]<0){
                    System.out.println(j-1);
                    return;
                }

            }
        }

    }
}
