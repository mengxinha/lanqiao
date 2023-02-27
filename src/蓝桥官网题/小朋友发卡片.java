package 蓝桥官网题;
//小懒有k种卡片, 一个班有n位同学, 小蓝给每位同学发了两张卡片, 一 位同学的两张卡片可能是同一种,
//也可能是不同种, 两张卡片没有顺序。没有两位同学的卡片都是一样的。
//

import java.util.Scanner;

//这道题注意解思想

public class 小朋友发卡片 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p =sc.nextInt();
        int n=0;
        for (int i = 1; i < Integer.MAX_VALUE; i++){
            for(int j = 1; j <=i; j++){
                n++;
                if(n>=p){
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}