package 历年真题;

//如果一个日期中年月日的各位数字之和是完全平方数，则称为一个完全日期。
//例如：2021年6月5日的各位数字之和为2 + 0 + 2 + 1 + 6 + 5 = 16，而16是一个完全平方数，它是4的平方。所以2021年6月5日是一个完全日期。
//例如：2021年6月23日的各位数字之和为2 + 0 + 2 + 1 + 6 + 2 + 3 = 16，是一个完全平方数。所以2021年6月23日也是一个完全日期。
//请问，从2001年1月1日到2021年12月31日中，一共有多少个完全日期？



//答案：977
import java.lang.Math;


public class 完全日期 {
    // 8位数字    1 2 3 4 5 6 7 8


    static boolean test(int n){
        int a=n%10;   //8
        n/=10;        //1234567
        int b=n%10;   //7
        n/=10;        //123456
        int c=n%10;   //6
        n/=10;        //12345
        int d=n%10;   //5
        n/=10;        //1234
        int e=n%10;   //4
        n/=10;        //123
        int f=n%10;   //3
        n/=10;        //12
        int g=n%10;   //2
        n/=10;        //1
        int h=n;
        int sum =a+b+c+d+e+f+g+h;   //36
        if(Math.sqrt(sum)%1==0) return true;
        else return false;

    }

    public static void main(String[] args) {
        int year =2001;
        int month =1;
        int day = 1;
        int count=0;
        int []arr = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(year=2001;year<2022;year++)
        {
            if((year%4==0&&year%100!=0)||(year%100==0&&year%400==0))   //是 4 非 100 或者 是 100 非 400
                arr[2]=29;
            else arr[2]=28;
            for(month =1;month<13;month++)
            {
                for(day = 1;day<=arr[month];day++)
                {
                    String n = ""+year+month+day;
                    int k= Integer.parseInt(n);
                    if(test(k)) count++;
                }
            }

        }
        System.out.println(count);


    }
}
