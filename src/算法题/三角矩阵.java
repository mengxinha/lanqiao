package 算法题;

//自顶向下
import static java.lang.Math.min;

public class 三角矩阵{
    public static void main(String[] args) {
        int[][]arr = new int[][]{{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}, {11, 12, 13, 14, 15}};


        int row = arr.length;
        int col = arr[5].length;
        int [][]triangle=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                if(j==0)
                    triangle[i][j]=arr[i-1][j]+arr[i][j];
                else if(j==i)
                    triangle[i][j]=arr[i-1][j-1]+arr[i][j];
                else
                    triangle[i][j]=min(arr[i-1][j],arr[i-1][j-1])+arr[i][j];

            }
        }
        int minSum = triangle[row-1][0];
        for(int j=1;j<row;j++){
            minSum = min(minSum,triangle[row-1][j]);
        }
        System.out.println(minSum);
    }

}
