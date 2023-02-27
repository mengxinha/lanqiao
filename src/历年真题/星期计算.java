package 历年真题;

//【问题描述】已知今天是星期六，请问  20^22天后是星期几？注意用数字 1 到 7 表示星期一到星期日。
//【答案提交】这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，
//        填写多余的内容将无法得分。
//答案：7 星期日


//考点：20^22 为20的22次幂(大于2^88)明显不在long类型的范围内【(2^63)-1】，那么就要分步骤做取余运算
public class 星期计算 {
    public static void main(String[] args) {
//        int n=10;
//        for(int i=1;i<23;i++)
//        {
//
//        }
        int n = 20;
        for(int i=0;i<21;i++)
            n = (20*n)%7;
//        System.out.println((n+5)%7+1);
//        System.out.println(n);
        //余数为1 若为4 则是星期三

        if(n==1){
            System.out.println("7");
        }
        else{
            System.out.println(n-1);
        }
//        int d = 6;
//        System.out.println((d+r+7+1)%7);
    }
}
