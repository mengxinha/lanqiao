package 历年真题;

//给定一个数列 A=【a1，a2，a3，a4…… an】
//问有多少个区间 【L，R】 满足区间内元素的元素乘积等于它们的和
//【样例输入】
//        4
//        1 3 2 2
//【样例输出】
//        6


import java.util.Scanner;

public class 和与乘积 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int []arr = new int[num];
        for(int i=0;i<num; i++)
        {
            int a =scanner.nextInt();
            arr[i]=a;
        }
        int count=num;  //用来计数 并且是最后的答案,初始化为数字的长度
        int add=0;
        int com=1;
        for(int i=0;i<num;i++)   // 特殊的：全部相加等全部相乘
        {
            add+=arr[i];
            com*=arr[i];
        }
        if(add == com) count++;

        for(int i=0;i<num;i++)  // 1 3 2 2 4   以第i个下标为第一个数字
        {
            add=arr[i];
            com=arr[i];
            for(int j=i+1;j<num;j++)
            {

                int k = j;
                add+=arr[k];
                com*=arr[k];
                if(add==com){
                    System.out.println((i+1) + "  "+(k+1));
                    count++;
                    break;
                }
            }

        }
        System.out.println(count);




    }
}
