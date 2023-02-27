package 历年真题;
//时间限制: 1.0s 内存限制: 512.0MB 本题总分：10 分
//        【问题描述】
//        小蓝老师教的编程课有 N 名学生，编号依次是 1 . . . N。第 i 号学生这学期刷题的数量是Ai。
//        对于每一名学生，请你计算他至少还要再刷多少道题，才能使得全班刷题比他多的学生数不超过刷题比他少的学生数。
//        【输入格式】
//        第一行包含一个正整数 N。
//        第二行包含 N 个整数：A1，A2，A3，A4，…… An。
//        【输出格式】
//        输出 N 个整数，依次表示第 1 . . . N 号学生分别至少还要再刷多少道题。
//        【样例输入】
//        5
//        12 10 15 20 6
//        【样例输出】
//        0 3 0 0 7
//        【评测用例规模与约定】
//        对于 30% 的数据，1 ≤ N ≤ 1000, 0 ≤  ≤ 1000.
//        对于 100% 的数据，1 ≤ N ≤ 100000, 0 ≤  ≤ 100000.

import java.util.*;
public class 最少刷题数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            temp[i] = nums[i];
        }
        // 排序数组
        Arrays.sort(temp);
        // 中间的下标
        int midIndex = n / 2;
        // 中间的值
        int midValue = temp[midIndex];

        int midOption = 0;

        int option = 0;
        // 左边和中值相同值的数量
        int sameLeft = 0;
        // 右边和中值相同值的数量
        int sameRight = 0;

        for (int i = midIndex - 1, j = midIndex; i >= 0; i--, j++) {
            if (temp[i] == midValue) {
                sameLeft++;
            }
            if (temp[j] == midValue) {
                sameRight++;
            }
            if (temp[i] != temp[j]) {
                break;
            }
        }

        if (sameLeft >= sameRight) {
            option = 1;
        }
        if (sameLeft > sameRight) {
            midOption = 1;
        }

        for (int i = 0, len = nums.length; i < len; i++) {
            int count = 0;
            if (nums[i] == midValue) {
                count = midOption;
            } else {
                count = midValue - nums[i] + option;
                if (count < 0) {
                    count = 0;
                }
            }
            if (i != n - 1) {
                System.out.print(count + " ");
            } else {
                System.out.println(count);
            }

        }
    }
}

