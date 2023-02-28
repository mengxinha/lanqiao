package 历年真题;

// 在一个矩阵中，只有 2 和 0
// 同一行，同一列，斜线（从左上到右下）

// 2 2 0 0 0 0
// 0 0 0 0 0 0
// 0 0 2 2 0 2
// 0 0 0 0 0 0
// 0 0 0 0 2 2
// 0 0 2 0 2 0

import java.util.Scanner;

public class 寻找2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 6;  //几行几列
        int sum =0;
        int [][]arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
//            String  str = scanner.next();
            for(int j=0;j<n;j++) {
//                arr[i][j]=Integer.parseInt(str);

                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<n;i++)  // 行
        {
            for(int j=0;j<n-4;j++)
            if(arr[i][j]*1000+arr[i][j+1]*100+arr[i][j+2]*10+arr[i][j+3]==2020)
            {
                sum++;
            }
        }
        for(int i=0;i<n;i++)  // 列
        {
            for(int j=0;j<=n-4;j++)
                if(arr[j][i]*1000+arr[j+1][i]*100+arr[j+2][i]*10+arr[j+3][i]==2020)
                {
                    sum++;
                }
        }
        for(int k=0;k<=n-4;k++)  // 斜线
        {
            for(int j=0;j<=n-4;j++)
                if(arr[k][j]*1000+arr[k+1][j+1]*100+arr[k+2][j+2]*10+arr[k+3][j+3]==2020)
                {
                    sum++;
                }
        }
        System.out.println(sum);
    }
}
