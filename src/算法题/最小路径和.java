package 算法题;

//状态：F（i，j）：从（0，0）到达（i，j）的最短路径和
//状态转移方程：F（i，j）=min（F（i-1，j），F（i，j-1））+arr[i][j]
//第一行：F（0，j）=F（0，j-1）+arr[0][j]
//第一列：F（i，0）=F（i-1，0）+arr[i][0]
//初始化：F（0，0）=arr[0][0]
//返回结果：F（row-1，col-1）

//注意边界的处理！！！

import static java.lang.Math.min;

public class 最小路径和 {
    public static void main(String[] args) {

        int row = 3;
        int col = 4;
        int[][]arr = new int[][]{{1,3,4,6},{2,3,5,3},{4,5,6,4}};

        int[][] F = new int[row][col];
        for (int i = 1; i < row; i++) {
            F[i][0] = F[i - 1][0] + arr[i][0];
        }
        for (int j = 1; j < col; j++) {
            F[0][j] = F[0][j - 1] + arr[0][j - 1];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                F[i][j] = min(F[i][j - 1], F[i - 1][j]) + F[i][j];
            }

        }
        System.out.println(F[row - 1][col - 1]);
    }


}
