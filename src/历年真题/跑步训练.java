package 历年真题;

//小蓝每天都锻炼身体。
//正常情况下，小蓝每天跑 1 千米。如果某天是周一或者月初（1 日），为了激励自己，小蓝要跑 2 千米。如果同时是周一或月初，小蓝也是跑 2 千米。
//小蓝跑步已经坚持了很长时间，从 2000年 1 月 1 日周六（含）到 2020 年 10 月 1日周四（含）。请问这段时间小蓝总共跑步多少千米？
//

// 每天1km
// 特殊情况 ：周一  月初（1 日） 2km


public class 跑步训练 {
    static int []arr = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};  //润年的话二月就是 29 天

    static boolean zhouyi(int n){  //第一天是周六

        if((n+4)%7==0) return true;
        else return false;

    }

    public static void main(String[] args) {
        int sumday=0;
        int sumkm=1;
        int yy=0;

        for(int year = 2000;year<2021;year++)
        {
            if(((year%4==0)&&(year%100!=0))||((year%100==0)&&(year%400!=0)))
                arr[2]=29;
            else
                arr[2]=28;
            if(year ==2020) yy=10;
            else yy = 13;
            for(int month = 1; month<yy; month++)
            {
                for(int day=1;day<=arr[month];day++)
                {
                    sumday++;
                    if((day==1)||(zhouyi(sumday)))
                    {
                        sumkm+=2;
                    }
                    else sumkm++;
                }

            }
        }
        System.out.println(sumkm);
    }
}
