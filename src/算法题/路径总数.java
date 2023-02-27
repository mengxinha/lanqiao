package 算法题;
//在 m * n 矩阵中求左上角到右下角的路径个数，二维数组，只能向下或向右

//状态： F（i，j）： 从（0，0）到（i，j）的路径个数
//状态转移方程： F（i，j）=F（i-1，j）+F（i，j-1）
//初始化：F（i，0）=1  F（0，j）=1
//返回结果：F（m-1，n-1）

public class 路径总数 {
    public static void main(String[] args) {
        int row = 3;
        int col = 7;
        int [][] pathNum = new int[row][col];
        for(int i=0;i<row;i++){
            pathNum[i][0]=1;
        }
        for(int j=0;j<col;j++){
            pathNum[0][j]=1;
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                pathNum[i][j]=pathNum[i][j-1]+pathNum[i-1][j];
            }
        }
        System.out.println(pathNum[row-1][col-1]);


    }
}
