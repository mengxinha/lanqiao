package 历年真题;

//对于一棵有根二叉树T，小蓝定义这棵树中结点的权值W(T)如下：
//空子树的权值为0。
//如果一个结点v有左子树L,右子树R，分别有C(L)和C（R）个结点，则:
//W(v) = 1 + 2W(L) + 3W（R） +(C(L))^2C(R)。
//树的权值定义为树的根结点的权值。
//小蓝想知道，对于一棵有2021个结点的二叉树，树的权值最小可能是多少？

//动态规划


import java.util.Arrays;


public class 最小权值 {
    public static void main(String[] args) {
        long[] dp = new long[2021 + 1];
        Arrays.fill(dp, Long.MAX_VALUE);  //不用遍历赋值的方法： 直接一次性为数组所有元素赋值,都赋最大值
        dp[0] = 0;
        for (int i = 1; i <= 2021; i++) {// 根节点数
            for (int j = 0; j <= i - 1; j++) {// 左子树节点数
                dp[i] = Math.min(1 + 2 * dp[j] + 3 * dp[i - j - 1] + j * j * (i - 1 - j), dp[i]);
            }
        }
        System.out.println(dp[2021]);
    }

}
