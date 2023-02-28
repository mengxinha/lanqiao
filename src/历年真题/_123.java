package 历年真题;


//小蓝发现了一个有趣的数列，这个数列的前几项如下：
//1, 1, 2, 1, 2, 3, 1, 2, 3, 4, …
//小蓝发现，这个数列前1项是整数1，接下来2项是整数1至2，接下来3项是整数1至3，接下来4项是整数1至4，依次类推。
//小蓝想知道，这个数列中，连续一段的和是多少。
//【输入格式】
//        输入的第一行包含一个整数T，表示询问的个数。
//        接下来T行，每行包含一组询问，其中第i行包含两个整数li和ri，表示询问数列中第li个数到第ri个数的和。
//        【输出格式】
//        输出T行，每行包含一个整数表示对应询问的答案。
//        【样例输入】
//        3
//        1 1
//        1 3
//        5 8
//        【样例输出】
//        1
//        4
//        8


//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5


import java.util.Scanner;

//用二维数组
public class _123 {



    public static void main(String[] args) {
        int []arr = new int[100000];
        int k=0;
        for(int i=0;i<100;i++){   //1 1 2 1 2 3
            int n=1;
            for(int j=0;j<=i;j++){
                arr[k]=n;
                k++;
                n++;
            }
        }
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int []cun = new int[num];

        for(int i=0;i<num;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int sum = 0;
            for(int j = 0;j<b-a+1;j++){
                sum += arr[a-1+j];

            }
            cun[i]=sum;

        }
        for(int i=0;i<num;i++){
            System.out.println(cun[i]);
        }


    }
}
